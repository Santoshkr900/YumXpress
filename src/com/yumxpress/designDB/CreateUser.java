package com.yumxpress.designDB;

import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateUser {

    public static void main(String[] args) {
        Connection conn = null;
        boolean status = true;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("Driver Loaded Successfully");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.exit(0);
        }
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-QJ5A2E5K:1521/xe", "system", "admin");
            System.out.println("Connected successfully to the DB");
            Statement st = conn.createStatement();
            conn.setAutoCommit(false);
            st.addBatch("CREATE USER YumXpress IDENTIFIED BY yumxpress");
            st.addBatch("Grant resource, connect to YumXpress");
            int[] ans = st.executeBatch();
            System.out.println("Total queries executed are:" + ans.length);
            for (int i = 0; i < ans.length; i++) {
                System.out.println("Query " + (i + 1) + " affected " + ans[i] + " rows");
            }

        } catch (BatchUpdateException ex) {
            int[] result = ex.getUpdateCounts();
            System.out.println("Query no " + (result.length + 1) + " generated exception");
            status = false;
        } catch (SQLException ex) {
            System.out.println("DB Error:" + ex.getMessage());
            status = false;
        } finally {
            try {
                if (conn != null) {
                    if (status == true) {
                        conn.commit();
                        System.out.println("All queries executed and committed");
                    } else {
                        conn.rollback();
                        System.out.println("Queries rolled back");
                    }
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error in closing the connection:" + ex.getMessage());
            }
        }
    }
}
