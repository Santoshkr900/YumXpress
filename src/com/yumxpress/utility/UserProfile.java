package com.yumxpress.utility;

public class UserProfile {

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        UserProfile.userName = userName;
    }

    public static String getUserId() {
        return userId;
    }

    public static void setUserId(String userId) {
        UserProfile.userId = userId;
    }

    public static String getEmailId() {
        return EmailId;
    }

    public static void setEmailId(String EmailId) {
        UserProfile.EmailId = EmailId;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        UserProfile.password = password;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        UserProfile.address = address;
    }

    public static String getMobileNo() {
        return mobileNo;
    }

    public static void setMobileNo(String mobileNo) {
        UserProfile.mobileNo = mobileNo;
    }

    private static String userName;
    private static String userId;
    private static String EmailId;
    private static String password;
    private static String address;
    private static String mobileNo;
}
