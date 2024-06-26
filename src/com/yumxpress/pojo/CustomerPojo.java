package com.yumxpress.pojo;

public class CustomerPojo {

    private String customerId;
    private String customerName;
    private String emailId;
    private String password;
    private String address;
    private String mobileNo;

    public CustomerPojo() {

    }

    public CustomerPojo(String customerId, String customerName, String emailId, String password, String address, String mobileNo) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.emailId = emailId;
        this.password = password;
        this.address = address;
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "CustomerPojo{" + "customerId=" + customerId + ", customerName=" + customerName + ", emailId=" + emailId + ", password=" + password + ", address=" + address + ", mobileNo=" + mobileNo + '}';
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileno(String mobileNo) {
        this.mobileNo = mobileNo;
    }

}
