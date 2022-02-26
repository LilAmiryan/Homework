package com.company.Homework_23_02_2022_Day_16;

import java.time.LocalTime;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //twoToThePowerOfN(input.nextInt());//Task 3
        // passedMinutesSinceTheBeginningOfTheDay(input.nextInt());//Task 4
        //primeNumber(input.nextInt());//Task 5
        // polidromNumbersofSegmentAB(input.nextInt(), input.nextInt());//Task 6
        // word(input.next());//Task 7
        // checkerboard(input.nextInt());//Task 8
        //geometricProgression(input.nextDouble(), input.nextDouble(), input.nextDouble());//Task 9
        expendingNumberIntoPrime(input.nextInt());//Task 10
        // multiplicationTable(input.nextInt(), input.nextInt());//Task 11
        //snakeMatrix(input.nextInt(), input.nextInt());//Task 13
    }

    /**
     * Task 3
     *
     * @param n
     */
    public static void twoToThePowerOfN(int n) {
        if (n >= 1 && n <= 15) {
            int number = 1;
            for (int i = 0; i < n; i++) {
                number = number * 2;
            }
            System.out.println(number);
        }
    }

    /**
     * Task 4
     *
     * @param n
     */
    public static void passedMinutesSinceTheBeginningOfTheDay(int n) {
        int count = 1;
        LocalTime localTime = null;
        if (n >= 1440) {
            n = n % 1440;
            while (n >= 60) {

                n = n % 60;
                count++;
                System.out.println(n);
            }
            localTime = LocalTime.of(count, n);
        } else {
            while (n >= 60) {
                n = n % 60;
                count++;
                System.out.println("count= " + count);
                System.out.println("n = " + n);
            }
            localTime = LocalTime.of(count, n);

        }
        System.out.println(localTime);
    }

    /**
     * Task 5
     *
     * @param number
     */
    public static void primeNumber(int number) {
        int i = 2;
        boolean b = false;
        if (number != 1 && number != 2 && number != 3) {
            while (i <= number / 2) {
                if (number % i != 0) {
                    b = true;
                } else {
                    b = false;
                    break;
                }
                i++;
            }

            System.out.println("i = " + i);
        } else {
            b = false;
        }
        System.out.println(b ? " number is prime." : "number is NOT prime.");
    }

    /**
     * Task 6
     *
     * @param a
     * @param b
     */
    public static void polidromNumbersofSegmentAB(int a, int b) {
        int i = a;
        int digitA[] = new int[4];
        int countA = 0;
        int ia = 0;
        int[] digit = new int[4];

        for (int f = a; f <= b; f++) {
            ia = 0;
            countA = 0;
            for (i = f; i > 0; i = i / 10) {
                digitA[ia] = i % 10;
                //  System.out.print(digitA[ia] + " ");
                ia++;
                countA++;
            }
            int m = 3;
            for (int k = 0; k < digit.length; k++) {
                digit[m] = digitA[k];
                m--;
            }
            System.out.println();
            pol(digit, digitA, f);
        }
    }

    public static void pol(int digit[], int[] digitA, int f) {
        boolean b = false;
        for (int k = 0; k < digit.length; k++) {
            if (digit[k] == digitA[k]) {
                b = true;
            } else {
                b = false;
            }
        }
        if (b)
            System.out.println(f + " is polidrom");
        else System.out.println(f + " is NOT polidrom");
    }

    /**
     * Task 7
     *
     * @param word
     */
    public static void word(String word) {
        String newWord;
        String firstLater;
        for (int i = 0; i < word.length(); i++) {
            firstLater = word.charAt(0) + "";
            String s = word.substring(1, word.length());
            newWord = firstLater.toUpperCase(Locale.ROOT) + s.toLowerCase(Locale.ROOT);
            System.out.println(newWord);
        }
    }

    /**
     * Task 8
     *
     * @param n
     */
    public static void checkerboard(int n) {

        for (int i = 0; i <= n; i++) {
            String o = "O";
            String x = "X";
            if (i % 2 == 0) {
                o = "X";
                x = "O";
            }
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    System.out.print(o);
                } else {
                    System.out.print(x);
                }
            }
            System.out.println();

        }
    }

    /**
     * Task 9
     *
     * @param b1
     * @param q
     * @param n
     */
    public static void geometricProgression(double b1, double q, double n) {
        double bN = 1;
        double qN = 1;
        for (int i = 0; i < n; i++) {

            while (n - 1 != 0) {
                qN = qN * q;
                n--;
            }
            bN = bN * b1 * qN;
            b1 = bN;
        }

        System.out.println(bN);
    }

    /**
     * Task 10
     * @param n
     */

    public static void expendingNumberIntoPrime(int n) {
        for (int i = 2; i <= n/2; i++)
        {
            while (n % i == 0)
            {
                System.out.print(i + " ");
                n = n / i;
            }
        }
        if (n != 0)
        {
            System.out.print(n);
        }
    }

    /**
     * Task 11
     *
     * @param n
     * @param m
     */
    public static void multiplicationTable(int n, int m) {
        int[][] array = new int[n][m];
        int j = 0;
        for (int i = 0; i < n; i++) {
            array[i][j] = i * j;
            j++;
            --i;
            if (j == m) {
                j = 0;
                i++;
            }

        }
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < m; k++) {
                System.out.print(array[i][k] + "\t");
            }
            System.out.println();
        }
    }


    /**
     * Task 13
     *
     * @param n
     * @param m
     */
    public static void snakeMatrix(int n, int m) {
        int value = 0;
        int matrix[][] = new int[n][m];
        for (int i = 0; i < n; i++) {

            if (i % 2 == 1) {
                for (int j = m - 1; j >= 0; j--) {
                    matrix[i][j] = value++;
                }
            } else {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = value++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < m; k++) {
                System.out.print(matrix[i][k] + "\t");
            }
            System.out.println();
        }
    }


}

