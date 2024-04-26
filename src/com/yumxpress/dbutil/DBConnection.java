package com.yumxpress.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnection {

    private static Connection conn = null;

    static {
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-QJ5A2E5K:1521/xe", "Yumxpress", "yumxpress");
            JOptionPane.showMessageDialog(null, "Connection opened");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "cannot open the Connection");
            ex.printStackTrace();
            System.exit(0);
        }
    }

    public static Connection getConnection() {
        return conn;
    }

    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("conn close successfully");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "cannot close the connection");
                ex.printStackTrace();
            }
        }
    }
}
