package com.yumxpress.designDB;

import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDB {

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
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-QJ5A2E5K:1521/xe", "YumXpress", "yumxpress");
            System.out.println("Connected successfully to the DB");
            Statement st = conn.createStatement();
            conn.setAutoCommit(false);
//            st.addBatch("create table companies(company_id varchar2(10) constraint companies_pk primary key, company_name varchar2(100) constraint cmp_unq_name unique, owner_name varchar2(50), password varchar2(20), status varchar2(50), email_id varchar2(100) constraint cmp_unq_em_id unique, security_key varchar2(100)");
//            st.addBatch("create table products(product_id varchar2(10) constraint products_pk primary key, company_id varchar2(10) constraint pd_fk_cmp_id references companies(company_id), product_name varchar2(50), product_price number(7,2), product_image blob)");
//            st.addBatch("create table staffs(staff_id varchar2(10) constraint staffs_pk primary key, company_id varchar2(30) constraint stf_fk_cmp_id references companies(company_id), email_id varchar2(30) constraint stf_nn_emid not null, password varchar2(30) constraint stf_nn_pwd not null, staff_name varchar2(50))");
//            st.addBatch("create table customers(customer_id varchar2(10) constraint customers_pk primary key, customer_name varchar2(50), email_id varchar2(30) constraint customers_em_nn not null, password varchar2(20), mobile_no varchar2(10), address varchar2(150))");
//            st.addBatch("create table orders(order_id varchar2(10) constraint orders_pk primary key, product_id varchar2(10) constraint ord_fk_pid references products(product_id), customer_id varchar2(10) constraint ord_fk_cmtr_id references customers(customer_id), staff_id varchar2(10) constraint ord_fk_stf_id references staffs(staff_id), review varchar2(200), status varchar2(50), company_id varchar2(20) constraint ord_fk_cmp_id references companies(company_id), otp number(10))");

            st.addBatch("CREATE TABLE COMPANIES (COMPANY_ID VARCHAR2(10) CONSTRAINT COMPANIES_PK PRIMARY KEY,COMPANY_NAME VARCHAR2(100) CONSTRAINT CMP_UNQ_NAME UNIQUE,OWNER_NAME VARCHAR2(50),PASSWORD VARCHAR2(20),STATUS VARCHAR2(50),EMAIL_ID VARCHAR2(100) CONSTRAINT CMP_UNQ_EM_ID UNIQUE,SECURITY_KEY VARCHAR2(100))");
            st.addBatch("CREATE TABLE PRODUCTS (PRODUCT_ID VARCHAR2(10) CONSTRAINT PRODUCTS_PK PRIMARY KEY, COMPANY_ID VARCHAR2(10) CONSTRAINT PD_FK_CMP_ID REFERENCES COMPANIES(COMPANY_ID),PRODUCT_NAME VARCHAR2(50),PRODUCT_PRICE NUMBER(7,2),PRODUCT_IMAGE BLOB)");
            st.addBatch("CREATE TABLE CUSTOMERS (CUSTOMER_ID VARCHAR2(10) CONSTRAINT CUSTOMERS_PK PRIMARY KEY,CUSTOMER_NAME VARCHAR2(50),EMAIL_ID VARCHAR2(30) CONSTRAINT CUSTOMERS_EM_NN NOT NULL,PASSWORD VARCHAR2(20),MOBILE_NO VARCHAR2(10),ADDRESS VARCHAR2(150))");
            st.addBatch("CREATE TABLE STAFFS (STAFF_ID VARCHAR2(10) CONSTRAINT STAFFS_PK PRIMARY KEY,COMPANY_ID VARCHAR2(30) CONSTRAINT STF_FK_CMP_ID REFERENCES COMPANIES(COMPANY_ID),EMAIL_ID VARCHAR2(30) CONSTRAINT STF_NN_EMID NOT NULL,PASSWORD VARCHAR2(30) CONSTRAINT STF_NN_PWD NOT NULL,STAFF_NAME VARCHAR2(50))");
            st.addBatch("CREATE TABLE ORDERS (ORDER_ID VARCHAR2(10) CONSTRAINT ORDERS_PK PRIMARY KEY,PRODUCT_ID VARCHAR2(10) CONSTRAINT ORD_FK_PID REFERENCES PRODUCTS(PRODUCT_ID),CUSTOMER_ID VARCHAR2(10) CONSTRAINT ORD_FK_CMTR_ID REFERENCES CUSTOMERS(CUSTOMER_ID),STAFF_ID VARCHAR2(10) CONSTRAINT ORD_FK_STF_ID REFERENCES STAFFS(STAFF_ID),REVIEW VARCHAR2(200),STATUS VARCHAR2(50),COMPANY_ID VARCHAR2(20) CONSTRAINT ORD_FK_CMP_ID REFERENCES COMPANIES(COMPANY_ID),OTP NUMBER(10))");

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
