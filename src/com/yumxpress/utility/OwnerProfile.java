
package com.yumxpress.utility;

public class OwnerProfile {

    public static String getOwnerName() {
        return OwnerName;
    }

    public static void setOwnerName(String OwnerName) {
        OwnerProfile.OwnerName = OwnerName;
    }

    public static String getCompanyName() {
        return CompanyName;
    }

    public static void setCompanyName(String CompanyName) {
        OwnerProfile.CompanyName = CompanyName;
    }

    public static String getCompanyId() {
        return CompanyId;
    }

    public static void setCompanyId(String CompanyId) {
        OwnerProfile.CompanyId = CompanyId;
    }
    private static String OwnerName;
    private static String CompanyName;
    private static String CompanyId;
}
