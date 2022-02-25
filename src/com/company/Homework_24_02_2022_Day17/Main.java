package com.company.Homework_24_02_2022_Day17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {4, 5, 6, 8, 1, 80};
        float[] arrayFloat = {1.2f, 5.6f, 4.7f};

        /*add(input.nextInt());
        add(input.nextInt(), input.nextFloat());
        add(input.nextFloat(),input.nextInt());*/ //Task 1

       /* System.out.println(getInt(input.nextInt()));
        System.out.println(getFloat(input.nextInt()));*///Task 2

        /*
        print(array);
        print(arrayFloat);*///Task 4

        // System.out.println(search(array, 5,5));// Task 5

        // System.out.println(s(input.nextInt()));//Task 6

        //System.out.println(max(input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()));//Task 7

        // System.out.println(distance(input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()));//Task 8

        // fahrenheitCelsius(input.nextFloat(),input.nextInt());//Task 9

        System.out.println(remainder(input.nextInt()));//Taask 10
    }

    /**
     * Task 1
     *
     * @param i
     */
    public static void add(int i) {
        System.out.println("int");
    }

    public static void add(int i, float f) {
        System.out.println("int, float");
    }

    public static void add(float f, int i) {
        System.out.println("float, int");
    }

    /**
     * Task 2
     *
     * @param i
     * @return
     */
    public static int getInt(int i) {
        return i + 5;
    }

    public static float getFloat(int i) {
        return (float) i + 5;
    }

    /**
     * Task 4
     *
     * @param array
     */
    public static void print(int array[]) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i == array.length - 1) {
                continue;
            }
            System.out.print(",");
        }
        System.out.print("]");

    }

    public static void print(float array[]) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i == array.length - 1) {
                continue;
            }
            System.out.print(",");
        }
        System.out.print("]");

    }

    /**
     * Task 5
     *
     * @param array
     * @return
     */
    public static int search(int[] array) {
        return array.length;
    }

    public static int search(int[] array, int arr) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == arr) {
                return i;
            }

        }
        return -1;

    }

    public static boolean search(int[] array, int arr, int index) {

        for (int i = 0; i < array.length; i++) {
            if (array[index] == arr) {
                return true;
            }

        }
        return false;

    }

    /**
     * Task 6
     *
     * @param r
     * @return
     */
    public static float s(int r) {
        final float PI = 3.14f;
        return (float) (PI * Math.pow(r, 2));
    }

    public static float s(float a) {
        return a * a;
    }

    public static int s(int a, int b) {
        return a * b;
    }

    /**
     * Task 7
     *
     * @param a
     * @param b
     * @return
     */
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int max(int a, int b, int c) {
        return max(a, b) > c ? max(a, b) : c;
    }

    public static int max(int a, int b, int c, int d) {
        return max(a, b, c) > d ? max(a, b, c) : d;
    }

    /**
     * Task 8
     *
     * @param x
     * @param y
     * @return
     */
    public static double distance(int x, int y) {
        return Math.sqrt((x * x) + (y * y));
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        if (x1 * x2 > 0 && y1 * y2 > 0) {
            int x = Math.abs((x2 - x1));
            int y = Math.abs((y2 - y1));
            return distance(x, y);
        }
        if (x1 * x2 < 0 && y1 * y2 > 0) {
            int x = Math.abs(x1) + Math.abs(x2);
            int y = Math.abs(y2 - y1);
            return distance(x, y);
        }
        if (x1 * x2 > 0 && y1 * y2 < 0) {
            int x = Math.abs(x2 - x1);
            int y = Math.abs(y1) + Math.abs(y2);
            return distance(x, y);
        }
        if (x1 * x2 < 0 && y1 * y2 < 0) {
            int x = Math.abs(x1) + Math.abs(x2);
            int y = Math.abs(y1) + Math.abs(y2);
            return distance(x, y);
        }
        return 0;
    }

    public static void fahrenheitCelsius(float fahrenheitCe, int choice) {
        switch (choice) {
            case 1:
                System.out.println((int) (fahrenheitCe - 32) * 1.8);
                break;
            case 2:
                System.out.println(fahrenheitCe - 32 * 1.8);
                break;
            default:
                System.out.println("Illegal argument.");
                break;
        }

    }

    /**
     * Task 9
     * @param choice
     * @param celsius
     */
    public static void fahrenheitCelsius(int choice, float celsius) {
        switch (choice) {
            case 1:
                System.out.println((int) (celsius / 1.8 + 32));
                break;
            case 2:
                System.out.println(celsius / 1.8 + 32);
                break;
            default:
                System.out.println("Illegal argument.");
                break;
        }

    }

    /**
     * Task 10
     * @param number1
     * @return
     */

    public static int remainder(int number1) {
        int digit=0 ;
        int count=0;
        int number=number1;
        do{
            count++;
            number1=number1/10;
        }while (number1>0);
        for (int i = 0; i < count; i++) {
            digit=digit+number%10;
            number = number / 10;
        }
       return digit;
    }
    public static int remainder(int number1, int number2) {
        return remainder(5)%number2;
    }
}

