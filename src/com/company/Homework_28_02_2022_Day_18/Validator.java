package com.company.Homework_28_02_2022_Day_18;

public class Validator {
    public static boolean intRange(int i) {
        if (i >= 18 && i <= 99)
            return true;
        else return false;
    }

    public static boolean FirstNameLengthRange(String s) {
        if (s.length() >= 3 && s.length() <= 15)
            return true;
        else return false;
    }

    public static boolean LastNameLengthRange(String s) {
        if (s.length() >= 6 && s.length() <= 20)
            return true;
        else return false;
    }

    static boolean isGenderLegal(String gender) {
        if (gender.compareToIgnoreCase("female") == 0 || gender.compareToIgnoreCase("male") == 0) {
            return true;
        } else return false;
    }

    static boolean isPassprtIdValid(String pId) {
        int size = pId.length();
        if ("AN".equals(pId.substring(0, 2)) && pId.length() == 8) {
            for (int i = 2; i < size; i++) {
                if (Character.isDigit(pId.charAt(i))) {
                    return true;
                }
                return false;
            }
        }

        //else return false;
        return false;
    }

    public static boolean isValidSide(byte side) {
        if (side >= 1 && side <= 20)
            return true;
        return false;
    }

    public static boolean isCountOfWorkerValid(int countOfWorker) {
        if (countOfWorker >= 2 && countOfWorker <= 50)
            return true;
        return false;
    }

    public static boolean isNameCharacterLeast3(String name) {
        if (name.length() >= 3)
            return true;
        return false;
    }

    public static boolean isPhoneNumberValid(String phoneNumber) {

        if (phoneNumber.length() == 8) {
            for (int i = 0; i < phoneNumber.length(); i++) {
                if (Character.isDigit(phoneNumber.charAt(i))) {
                    return true;
                }
            }

        }
        return false;
    }
}
