package com.company.Homework_17_02_2022_Day_13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // printArray(fullArray());
        // fillingArrayOneZero(input.nextInt()); //Task 1
        // fillingArrayOneTwoZero(input.nextInt());//Task 2
        //symmetrical();//Task 3
        //athletes(input.nextInt(),input.nextInt());//Task 4
        //athletesMax(input.nextInt(),input.nextInt());//Task 5
        //addMatrix(input.nextInt());//Task 8
        //spiral(input.nextInt());//Task 9
        spyralWithNumbers(input.nextInt());
        input.close();

    }

    /**
     * @return
     */
    public static int[][] fullArray() {
        int[][] a = new int[5][4];
        for (int i = 0; i < a[i].length; i++) {
            for (int j = 0; j < a[j].length; j++) {
                a[i][j] = (int) (Math.random() * 10);
            }
        }
        return a;
    }

    /**
     * @param fullArray
     */
    public static void printArray(int[][] fullArray) {
        for (int i = 0; i < fullArray[i].length; i++) {
            for (int j = 0; j < fullArray[j].length; j++) {
                System.out.print(fullArray[i][j] + " ");
            }
            //System.out.print("Array = ["+i+"]="+fullArray[i]+"\n");
            System.out.println();
        }
    }

    /**
     * Task 1
     *
     * @param n
     */
    public static void fillingArrayOneZero(int n) {
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = 0;
                if (i + j == n - 1)
                    array[i][j] = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Task 2
     *
     * @param n
     */

    public static void fillingArrayOneTwoZero(int n) {
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = 0;
                if (i + j == n - 1) {
                    array[i][j] = 1;
                }
                if (i + j > n - 1) {
                    array[i][j] = 2;
                }
                if (i + j < n - 1) {
                    array[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }
        //printArray(array);
    }

    /**
     * Task 3
     */
    public static void symmetrical() {
        int[][] array = new int[3][3];
        array[0][0] = 0;
        array[0][1] = 1;
        array[0][2] = 2;
        array[1][0] = 1;
        array[1][1] = 5;
        array[1][2] = 3;
        array[2][0] = 2;
        array[2][1] = 7;
        array[2][2] = 4;
       /* for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (int)(Math.random()*10);

            }
        }*/
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        boolean b = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] != array[j][i]) {
                    //System.out.println(array[i][j]+" ");
                    b = false;
                }
            }
        }
        if (b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    /**
     * Task 4
     *
     * @param n
     * @param m
     */
    public static void athletes(int n, int m) {
        int array[][] = new int[n][m];
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0, max = arr[0];
        int k = 0;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < m; j++) {
                sum = sum + array[i][j];
                k = i;

            }
            arr[i] = sum;
//            System.out.print("Sum = "+sum+" ");
//            System.out.print("arr[i] = "+arr[i]+" ");
        }

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Max = " + max + " index " + k);

    }

    /**
     * Task 5
     *
     * @param n
     * @param m
     */
    public static void athletesMax(int n, int m) {
        int array[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int max = array[0][0];
        int k = 0;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                    k = i;
                }
            }
        }

        System.out.println("Max = " + max + " index " + k);
    }

    /**
     * Task 8
     *
     * @param m
     */
    public static void addMatrix(int m) {
        int array[][] = new int[m][m];
        int arr[][] = new int[m][m];
        int add[][] = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = (int) (Math.random() * 10);
                arr[i][j] = (int) (Math.random() * 7);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("///////////////");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                add[i][j] = array[i][j] + arr[i][j];
            }
        }
        System.out.println("////////");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Task 9
     * Spyral with 0,1
     * @param n
     *
     */
    /*
    public static void spiral(int n) {
        int[][] array = new int[n][n];


        int minC = 0;
        int maxC = n - 1;
        int minR = 0;
        int maxR = n - 1;


        while (true) {
            for (int i = minC; i <= maxC; i++) {
                array[minR][i] = 1;
            }
            //minR=minR+2;
            for (int i = minR+1; i <=maxR; i++) {
                array[i][maxC] = 1;
            }
           for (int i = minC; i <maxC ; i++) {
                array[maxR][i]=1;
            }

            for (int i = minR+2; i <maxR; i++) {
                array[i][minC]=1;
            }
            maxC=maxC-2;
            maxR=maxR-2;
            minC=minC+2;
            minR=minR+2;
            if (maxR == 0 || maxC == 0) {
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();

        }
    }

     */


    /**
     * Task 10
     * Spyral with numbers
     * @param n
     */
    public static void spyralWithNumbers(int n){

        int[][] spiral = new int[2*n+1][2*n+1];

        int value = 1;

        int minCol = 0;

        int maxCol = (2*n+1)-1;

        int minRow = 0;

        int maxRow = (2*n+1)-1;

        while (value <= (2*n+1)*(2*n+1))
        {
            for (int i = minCol; i <= maxCol; i++)
            {
                spiral[minRow][i] = value;

                value++;
            }

            for (int i = minRow+1; i <= maxRow; i++)
            {
                spiral[i][maxCol] = value;

                value++;
            }

            for (int i = maxCol-1; i >= minCol; i--)
            {
                spiral[maxRow][i] = value;

                value++;
            }

            for (int i = maxRow-1; i >= minRow+1; i--)
            {
                spiral[i][minCol] = value;

                value++;
            }

            minCol++;

            minRow++;

            maxCol--;

            maxRow--;
        }

        for (int i = 0; i < spiral.length; i++)
        {
            for (int j = 0; j < spiral.length; j++)
            {
                System.out.print(spiral[i][j]+ "\t");
            }

            System.out.println();
        }
    }

}


