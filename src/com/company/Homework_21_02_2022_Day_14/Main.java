package com.company.Homework_21_02_2022_Day_14;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println(lenghthOfString(input.next())); // Task 1
        //System.out.println(getCcharacterOfString(input.next(),input.nextInt()));
        // System.out.println(isContainCharacter(input.next(),input.next().charAt(0))); //Task 3
        //countOfVowels(input.next()); //Task 4
       /* System.out.println("Enter a String : ");
        System.out.println(reverseString(input.next()));*/ //Task 5
        // countVowelsDigits(input.next());//Task 6
        // caesarCode(input.next(), input.nextInt()); // Task 7
        //polidrom(input.next()); //Task 8
        // checkBinStr(input.next());//Task 9
        // hexOrNot(input.next());//Task 10
        // bin2Dec(input.next());//Task 11
        // countOfDublicateCharacters(input.next());//Task 12--------
        //nonRepeatedCharacter(input.next());//Task 13
        //countOfCharacter(input.next(), input.next().charAt(0));//Task 14
        System.out.println(dupCharsCount2(input.next()));//By Narek

    }

    /**
     * Task 1
     *
     * @param string
     * @return
     */
    public static int lenghthOfString(String string) {
        return string.length();
    }

    /**
     * Task 2
     *
     * @param string
     * @param i
     * @return
     */
    public static char getCcharacterOfString(String string, int i) {
        return string.charAt(i);
    }

    /**
     * Task 3
     *
     * @param string
     * @param character
     * @return
     */
    public static boolean isContainCharacter(String string, char character) {
        return string.contains(character + "");
    }

    /**
     * Task 4
     *
     * @param string
     */
    public static int countOfVowels(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            switch (ch) {
                case 'a':
                    count++;
                    break;
                case 'e':
                    count++;
                    break;
                case 'i':
                    count++;
                    break;
                case 'o':
                    count++;
                    break;
                case 'u':
                    count++;
                    break;
            }

        }
        return count;
    }

    /**
     * Task 5
     *
     * @param string
     * @return
     */
    public static String reverseString(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        return "The reverse of the String %sstring is " + stringBuilder.reverse();
    }

    /**
     * Task 6
     *
     * @param string
     */
    public static void countVowelsDigits(String string) {
        int countOfVowels = countOfVowels(string);
        double persent = (double) (countOfVowels(string) * 100 / string.length());
        System.out.print(("Count of vowels is " + countOfVowels + " " + persent + " %\n"));
        int count = 0;
        char num = '1';
        for (int i = 0; i < string.length(); i++) {
            for (char j = '0'; j <= '9'; j++) {
                if (string.charAt(i) == (int) j) {
                    count++;
                }
            }
        }
        double persentOfCount = (double) count * 100 / string.length();
        System.out.println("Count of digits is " + count + " " + persentOfCount + " % ");
    }

    /**
     * Task 7
     *
     * @param string
     */
    public static void caesarCode(String string, int n) {
        char c[] = new char[string.length()];
        for (int j = 0; j < string.length(); j++) {
            if (string.charAt(j) >= 'a' && string.charAt(j) <= 'z') {
                c[j] = (char) (string.charAt(j) + n);
            }
            if ((string.charAt(j) + n) > 'z') {
                c[j] = (char) (string.charAt(j) + n + 'a' - 'z' - 1);
            }
            System.out.println(c[j]);
        }

    }

    /**
     * Task 8
     *
     * @param string
     */
    public static void polidrom(String string) {
        int count = 0;
        for (int i = 0; i < string.length() / 2; i++) {
            for (int j = string.length() - 1; j > string.length() / 2; j--) {
                if (string.charAt(i) == string.charAt(j)) {
                    count++;
                }
            }
        }
        if (count == string.length() / 2) {
            System.out.println(string + " is polidrom");
        } else
            System.out.println(string + " is not polidrom");

    }

    /**
     * Task 9
     *
     * @param string
     */
    public static void checkBinStr(String string) {
        boolean b = false;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= '0' && string.charAt(i) <= '1') {
                b = true;
            } else b = false;
        }
        if (b)
            System.out.println(string + "is a binary string");
        else System.out.println(string + " is NOT binary string");
    }

    /**
     * Task 10
     *
     * @param string
     */
    public static void hexOrNot(String string) {
        char ch[] = string.toUpperCase(Locale.ROOT).toCharArray();
        boolean b = false;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= '0' && ch[i] <= '9' || ch[i] == 'A' || ch[i] == 'B' || ch[i] == 'C' || ch[i] == 'D' || ch[i] == 'E' || ch[i] == 'F') {
                b = true;
            } else b = false;
        }

        if (b) {
            System.out.println(string + " is a hex string");
        } else {
            System.out.println(string + " is NOT hex string");
        }

    }

    /**
     * Task 11
     *
     * @param string
     */
    public static void bin2Dec(String string) {
        char[] ch = string.toCharArray();
        int number = 0;
        int j = ch.length - 1;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '1')
                number = number + (1 * (char) Math.pow(2, j));
            j--;
        }
        System.out.println(number);
    }

    /**
     * Task 12 by Narek
     *
     * @param
     */

    public static int dupCharsCount2(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i != str.lastIndexOf(str.charAt(i))) {
                count++;
                str = str.replace(str.substring(i, i + 1), "");

            }
        }
        return count;
    }

    /**
     * Task 12-------------
     * @param string
     */
    /*
    public static void countOfDublicateCharacters(String string) {
        char[] character = string.toCharArray();
        int count = 0;
        int j = 0;
        for (int i = 0; i < character.length; i++) {
            if (character[i] != character[j] && i != j) {
                j++;
                count++;

            }
        }
        System.out.println(count);
    }
*/
    /**
     * Task 13
     *
     * @param string
     */

    public static void nonRepeatedCharacter(String string) {
        char[] character = string.toCharArray();
        char count;

        for (int i = 0; i < character.length; i++) {
            boolean b = true;
            for (int j = 0; j < string.length(); j++) {
                if (i != j && character[i] == character[j]) {
                    b = false;
                    break;
                }
            }
            if (b) {
                System.out.println(character[i]);
                break;
            }

        }

    }

    /**
     * Task 14
     *
     * @param string
     * @param character
     */
    public static void countOfCharacter(String string, char character) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == character) {
                count++;
            }
        }
        System.out.println(count);
    }
}
