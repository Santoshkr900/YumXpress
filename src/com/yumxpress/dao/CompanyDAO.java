package com.yumxpress.dao;

import com.yumxpress.dbutil.DBConnection;
import com.yumxpress.pojo.CompanyPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class CompanyDAO {

    public static String getNewId() throws SQLException {

        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select max(company_id) from companies");
        rs.next();
        String id = rs.getString(1);
        String compId = "";
        if (id != null) {
            id = id.substring(4);
            compId = "CMP-" + (Integer.parseInt(id) + 1);
        } else {
            compId = "CMP-101";
        }
        return compId;
    }

    public static boolean addSeller(CompanyPojo comp) throws SQLException {

        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("insert into companies values(?,?,?,?,?,?,?)");

        ps.setString(1, getNewId());
        ps.setString(2, comp.getCompanyName());
        ps.setString(3, comp.getOwnerName());
        ps.setString(4, comp.getPassword());
        ps.setString(5, "ACTIVE");
        ps.setString(6, comp.getEmailId());
        ps.setString(7, comp.getSecurityKey());

        return ps.executeUpdate() == 1;

    }

    public static CompanyPojo validate(String compName, String password) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select * from companies where company_name=? and password=? and status='ACTIVE'");
        ps.setString(1, compName);
        ps.setString(2, password);
        ResultSet rs = ps.executeQuery();
        CompanyPojo comp = null;
        if (rs.next()) {
            comp = new CompanyPojo();
            comp.setCompanyId(rs.getString(1));
            comp.setCompanyName(rs.getString(2));
            comp.setOwnerName(rs.getString(3));
        }
        return comp;
    }

    public static Map<String, String> getEmailCredentialsByCompanyId(String CompanyID) throws SQLException {
        HashMap<String, String> map = new HashMap<>(); // enter in CompanyDao
        Connection conn = DBConnection.getConnection(); // connection opened
        PreparedStatement ps = conn.prepareStatement("Select email_id,security_key from companies where company_id=?");
        ps.setString(1, CompanyID);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            map.put("emailId", rs.getString(1));
            map.put("securityKey", rs.getString(2));//email securitykey
        }
        return map;
    }

    public static Map<String, String> getAllSellerDetails() throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select company_id,company_name from companies where company_id in(select company_id from products)");
        HashMap<String, String> sellerDetails = new HashMap<>();
        while (rs.next()) {
            sellerDetails.put(rs.getString(2), rs.getString(1));
        }
        return sellerDetails;
    }
}
