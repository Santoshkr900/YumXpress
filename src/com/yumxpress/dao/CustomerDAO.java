package com.yumxpress.dao;

import com.yumxpress.dbutil.DBConnection;
import com.yumxpress.pojo.CustomerPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerDAO {

    public static String getNewId() throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select max(customer_Id) from Customers");
        rs.next();
        String id = rs.getString(1);
        if (id != null) {
            String new_id = id.substring(4);
            int generated_newid = Integer.parseInt(new_id) + 1;
            return "CUST-" + generated_newid;
        } else {
            return "CUST-101";
        }
    }

    public static boolean addCustomer(CustomerPojo customer) throws SQLException {
        Connection conn = DBConnection.getConnection();
        String sql = "insert into Customers values(?,?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, customer.getCustomerId());
        ps.setString(2, customer.getCustomerName());
        ps.setString(3, customer.getEmailId());
        ps.setString(4, customer.getPassword());
        ps.setString(5, customer.getMobileNo());
        ps.setString(6, customer.getAddress());
        return ps.executeUpdate() == 1;
    }

    public static CustomerPojo validate(String cust_emailid, String pwd) throws SQLException {
        Connection conn = DBConnection.getConnection();
        CustomerPojo cust = null;
        PreparedStatement ps = conn.prepareStatement("Select * from customers where email_id=? and Password=?");
        ps.setString(1, cust_emailid);
        ps.setString(2, pwd);
        //ps.setString(3,st);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            cust = new CustomerPojo();
            cust.setCustomerId(rs.getString(1));
            cust.setCustomerName(rs.getString(2));
            cust.setMobileno(rs.getString(5));
            cust.setEmailId(cust_emailid);
        }
        return cust;
    }

    public static CustomerPojo getCustomerDetailsById(String Custid) throws SQLException {
        Connection conn = DBConnection.getConnection();
        CustomerPojo cust = new CustomerPojo();
        PreparedStatement ps = conn.prepareStatement("Select * from customers where customer_id=?");
        ps.setString(1, Custid);
        ResultSet rs = ps.executeQuery();
        rs.next();
        cust.setCustomerName(rs.getNString(2));
        cust.setEmailId(rs.getString(3));
        cust.setPassword(rs.getString(4));
        cust.setMobileno(rs.getString(5));
        cust.setAddress(rs.getString(6));
        return cust;
    }

    public static boolean updateCustomer(CustomerPojo customer) throws SQLException {
        Connection conn = DBConnection.getConnection();
        String sql = "update customers set customer_name=?,password=?,mobile_no=?,address=? where customer_id=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(5, customer.getCustomerId());
        ps.setString(1, customer.getCustomerName());
        ps.setString(2, customer.getPassword());
        ps.setString(3, customer.getMobileNo());
        ps.setString(4, customer.getAddress());

        return ps.executeUpdate() == 1;

    }

}
