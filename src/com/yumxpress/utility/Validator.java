package com.yumxpress.utility;

import java.util.Random;
import org.apache.commons.validator.routines.EmailValidator;

public class Validator {

    public static boolean isValidEmail(String emailId) {

        EmailValidator ev = EmailValidator.getInstance();
        return ev.isValid(emailId);
    }

    public static boolean isValidMobileNo(String mobileNo) {
        if (mobileNo.length() != 10) {
            return false;
        }
        for (int i = 0; i < mobileNo.length(); i++) {
            if (!Character.isDigit(mobileNo.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static String getOtp() {
        Random random = new Random();
        StringBuffer otp = new StringBuffer("");
        for (int i = 0; i < 6; i++) {
            otp.append(random.nextInt(10));
        }
        return otp.toString();
    }
}
