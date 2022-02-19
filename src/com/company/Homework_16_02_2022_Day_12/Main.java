package com.company.Homework_16_02_2022_Day_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // evenIndexElement(fullArray());//Task 1
        // evenElement(fullArray());//Task 2
        //  positivElementIndex(fullArray());//Task 3
        // largeThanPreviousElement(fullArray());//Tsk 4
        //adjacentElementsOfTheSameSign(input.nextInt());//Task 5
        //largestElement(input.nextInt());//Task 6
        // smalestOfPositivetElement();//Task 7
        //  System.out.println(fullArray(input.nextInt()));
        //differentElementsOfSortingArray();//Task 8
        //reverseWithoudChanging(fullArray());//Task 9
        //reverseWithChanging(fullArray());//Task 10
        // reverseTwoElements(fullArray());
        // shiftLeft(fullArray());
        // swapMaxMin(fullArray());//Task 13
        //removeElement(input.nextByte());//Task 14
        onceInArray(fullArray());//Task 15 ?
    }

    /**
     * Task 1
     *
     * @param array
     */
    public static void evenIndexElement(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    /**
     * Task 2
     *
     * @param array
     */
    public static void evenElement(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    /**
     * Task 3
     *
     * @param array
     */
    public static void positivElementIndex(int[] array) {
       /* int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (-10 + Math.random() * 20);
        }*/
        // printArray(fullArray());
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                System.out.print(i + " ");
            }
        }
    }

    /**
     * Task 4
     *
     * @param array
     */
    public static void largeThanPreviousElement(int[] array) {
        //printArray(fullArray());
        /*int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
        }*/
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < array.length; i = i + 2) {
            if (array[i] > array[i - 1]) {
                System.out.print(array[i] + " ");
            }
        }
    }

    /**
     * TAsk 5
     *
     * @param size
     */
    public static void adjacentElementsOfTheSameSign(int size) {
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (-10 + Math.random() * 20);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < array.length; i++) {
            if ((array[i] * array[i - 1]) >= 0) {
                System.out.print(array[i - 1] + " " + array[i] + " \n");
                return;
            }

        }
    }

    /**
     * Task 6
     *
     * @param size
     */
    public static void largestElement(int size) {
        int array[] = new int[size];
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (-5 + Math.random() * 20);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        max = array[0];
        int k = 0;
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                k = i;

            }
        }
        System.out.print("Max = " + max + " Index of max is " + k);
    }

    public static int[] fullArray() {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (-5 + Math.random() * 20);
        }
        return a;
    }

    public static void printArray(int[] fullArray) {
        for (int i = 0; i < fullArray.length; i++) {
            //System.out.print("Array = ["+i+"]="+fullArray[i]+"\n");
            System.out.print(fullArray[i] + " ");
        }
    }

    /**
     * Task 7
     */
    public static void smalestOfPositivetElement() {
        int array[] = {100, 20, -1, 2};
        int min = 0;
        int sum = 0;
        boolean b = false;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            sum = sum + (int) (Math.abs(array[i]));
            if (sum < 1000) {
                b = true;
            } else
                b = false;
        }

        System.out.println(b);
        if (b == true) {
            min = array[0];
            int k = 0;
            System.out.println();
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 0) {
                    if (min > array[i]) {
                        min = array[i];
                        k = i;
                    }
                }
            }
            System.out.print("Max = " + min + " Index of min is " + k);
        }
    }

    /**
     * Task 8
     */
    public static void differentElementsOfSortingArray() {
        int[] array = {1, 22, 33, 444, 555, 666};
        int count = 0;
        printArray(array);
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[i] + 1) {
                count++;
            }
        }
        System.out.println(count + " different element");
    }

    /**
     * Task 9
     *
     * @param array
     */

    public static void reverseWithoudChanging(int[] array) {
        printArray(array);
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    /**
     * Task 10
     *
     * @param array
     */
    public static void reverseWithChanging(int[] array) {
        printArray(array);
        System.out.println();
        int r;
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                r = array[j];
                array[j] = array[j - 1];
                array[j - 1] = r;
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }

    }

    /**
     * Task 11
     *
     * @param array
     */
    public static void reverseTwoElements(int[] array) {
        printArray(array);
        System.out.println();
        int r;
        for (int i = 0; i < array.length - 1; i = i + 2) {

            r = array[i];
            array[i] = array[i + 1];
            array[i + 1] = r;
        }

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }

    }

    /**
     * Test
     *
     * @param array
     */
    public static void shiftLeft(int[] array) {
        printArray(array);
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            array[0] = array[array.length - 1];

        }
    }

    /**
     * Task 14
     *
     * @param k
     */
    public static void removeElement(int k) {
        int count = 0;
        int array[] = {1, 2, 5, 2, 7};
        printArray(array);
        System.out.println();
        for (int i = 0; i < array.length - 1; i++) {
            if (k == array[array.length - 1]) {
                array[array.length - 1] = array[0];
            }
            if (array[i] == k) {

                array[i] = array[i + 1];
                array[i + 1] = array[i + 2];
            }
        }
        printArray(array);
    }

    /**
     * Task 13
     *
     * @param array
     */
    public static void swapMaxMin(int[] array) {
        int max, mx = 0;
        int min, mn = 0;
        printArray(array);
        System.out.println();
        max = array[0];
        for (int i = 0; i < array.length; i++) {

            if (max < array[i]) {
                max = array[i];
                mx = i;
            }
        }
        min = array[0];
        for (int i = 0; i < array.length; i++) {

            if (min > array[i]) {
                min = array[i];
                mn = i;
            }
        }
        System.out.println("Max is " + max + " Index is " + mx);
        System.out.println("Min is " + min + " Index is " + mn);
        for (int i = 0; i < array.length; i++) {
            array[mx] = min;
            array[mn] = max;

        }
        printArray(array);
    }

    /**
     * Task 15
     * @param array
     */
    public static void onceInArray(int[] array) {
        printArray(array);
        System.out.println();
        int k = array[0], count = 0;
        boolean b;
        for (int i = 0; i < array.length; i++) {
            b = false;
            for (int j = 0; j < array.length; j++) {

                if (array[i] == array[j] && i!=j) {
                    b = true;
                    break;
                }
            }
            if (!b) {
                System.out.print(array[i] + " ");
            }

        }
    }
}
