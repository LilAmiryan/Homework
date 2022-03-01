package com.company.Homework_28_02_2022_Day_18;

public class Validator {
    public static boolean intRange(int i) {
            return (i >= 18 && i <= 99);
    }

    public static boolean FirstNameLengthRange(String s) {
            return (s.length() >= 3 && s.length() <= 15);
    }

    public static boolean LastNameLengthRange(String s) {
            return (s.length() >= 6 && s.length() <= 20);
    }

    static boolean isGenderLegal(String gender) {
            return ("female".compareToIgnoreCase(gender) == 0 || "male".compareToIgnoreCase(gender) == 0);
    }

    static boolean isPassprtIdValid(String pId) {
        int size = pId.length();
        if ("AN".equals(pId.substring(0, 2)) && pId.length() == 8) {
            for (int i = 2; i < size; i++) {
                if (!Character.isDigit(pId.charAt(i))) {
                    return false;
                }
                return true;
            }
        }

        return true;
    }

    public static boolean isValidSide(byte side) {
            return (side >= 1 && side <= 20);
    }

    public static boolean isCountOfWorkerValid(int countOfWorker) {
            return (countOfWorker >= 2 && countOfWorker <= 50);
    }

    public static boolean isNameCharacterLeast3(String name) {
            return (name.length() >= 3);

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
