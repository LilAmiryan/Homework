package com.company.Homework_11_02_2022;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = "Hello";
        String s2 = new String();
        String s = null;

        //s2="Hello";
        // equalsStrings(input.next(),input.next());// Task 1
        // equalsStrings(s1,s2); //Task 2
        // checkWithTernary(input.nextInt(),s);// Task3
        max(input.nextInt(), input.nextInt(), input.nextInt());//Task 4
       /*
        System.out.println("    a. int 1x=10;\n" +
                "   b. int x=10;\n" +
                "   c. float x=10.0f;\n" +
                "   d. string x=\"10\";\n   Enter your choice ");
        rihgtAnswer(input.next());*/ //Task 9

       /* String symbol= String.valueOf(input.next().toLowerCase(Locale.ROOT).charAt(0));
        vovelOrConstonant(symbol.charAt(0));*/ //Task 10-1
        // pressedNumber(input.next().charAt(0));//Task 10-2
        // evenOrOddUsingSwitchVersion2(input.nextInt()); //Task 11 Version 2
        //calculator(input.nextInt(),input.next().charAt(0),input.nextInt());//Tasak 12
        //weekDays(input.next());//13
      /*  System.out.print("Quiz score\nMid-term score\nFinal score\n");
        grade(input.nextInt(), input.nextInt(), input.nextInt());*///Task 14
        input.close();
    }

    /**
     * Task 1,2
     *
     * @param a
     * @param b
     */
    public static void equalsStrings(String a, String b) {
        System.out.println("String1 == String2 " + (a == b));
        System.out.println("String1 equals String2 " + (a.equals(b)));

    }

    /**
     * Task 3
     *
     * @param i
     */
    public static void checkWithTernary(int i, String s) {
        System.out.println(i > 0 ? "Positive" : (i == 0) ? "0" : "Negative");
        System.out.println(s == null ? "-1" : (s.equals("")) ? "0" : "1");
    }

    /**
     * Task 4
     *
     * @param a
     * @param b
     * @param c
     */
    public static void max(int a, int b, int c) {
        System.out.println((a > b) ? (b > c) ? a : (a > c) ? a : c : (c > b) ? c : b);
    }

    /**
     * Task 9
     *
     * @param s
     */
    public static void rihgtAnswer(String s) {

        switch (s) {
            case "a":
            case "c":
            case "d":
                System.out.println("Invalide choice");
                break;
            case "b":
                System.out.println("Congratulation");
                break;
        }
    }

    /**
     * Task 10-1
     *
     * @param character
     */
    public static void vovelOrConstonant(char character) {
        switch (character) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vovel");
                break;
            default:
                System.out.println("Constonant");

        }
    }

    /**
     * Task 10-2
     *
     * @param chracter
     */
    public static void pressedNumber(char chracter) {
        switch (chracter) {
            case '0':
                System.out.println("Zero");
                break;
            case '1':
                System.out.println("One");
                break;
            case '2':
                System.out.println("Two");
                break;
            case '3':
                System.out.println("Three");
                break;
            case '4':
                System.out.println("Four");
                break;
            case '5':
                System.out.println("Five");
                break;
            case '6':
                System.out.println("Six");
                break;
            case '7':
                System.out.println("Seven");
                break;
            case '8':
                System.out.println("Eight");
                break;
            case '9':
                System.out.println("Nine");
                break;
            default:
                System.out.println("Not allowed");

        }
    }

    /**
     * Task 11 Version 1
     *
     * @param i
     */
    public static void evenOrOddUsingSwitchVersion1(int i) {
        int k = 1;
        switch (k) {
            case 1:
                System.out.println((i % 2 == 0) ? "Even" : "Odd");
                break;
        }
    }

    /**
     * Task 11 Version 2
     *
     * @param i
     */
    public static void evenOrOddUsingSwitchVersion2(int i) {
        switch (i % 2) {
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
                break;
        }
    }

    /**
     * Task 12
     *
     * @param a
     * @param character
     * @param b
     */
    public static void calculator(double a, char character, double b) {
        switch (character) {
            case '+':
                System.out.println("a " + character + " b = " + (a + b));
                break;
            case '-':
                System.out.println("a " + character + " b = " + (a - b));
                break;
            case '*':
                System.out.println("a " + character + " b = " + (a * b));
                break;
            case '/':
                System.out.println("a " + character + " b = " + (a / b));
                break;
            case '%':
                System.out.println("a % " + character + " b = " + (a % b));
                break;
        }
    }

    /**
     * Task 13
     *
     * @param day
     */
    public static void weekDays(String day) {
        switch (day) {
            case "Monday":
                System.out.println(1);
                break;
            case "Tuesday":
                System.out.println(2);
                break;
            case "Wednesday":
                System.out.println(3);
                break;
            case "Friday":
                System.out.println(5);
                break;
            case "Saturday":
                System.out.println(6);
                break;
            case "Sunday":
                System.out.println(7);
                break;
        }
    }

    /**
     * Task 14
     *
     * @param quiz
     * @param mid_term
     * @param final_scores
     */
    public static void grade(int quiz, int mid_term, int final_scores) {
        int average = (quiz + mid_term + final_scores) / 3;
        switch (average / 10) {
            case 8:
            case 9:
            case 10:
                System.out.println("Grade = A");
                break;
            case 7:
            case 6:
                System.out.println("Grade = B");
                break;
            case 4:
            case 5:
                System.out.println("Grade = C");
                break;
            default:
                System.out.println("Grade = F");
        }
    }

}
