package com.company.Homework_14_02_2022;

import java.lang.management.MemoryType;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // numbers1of10();//Task 1
        // evenNumbers1of20();//Task 2
        // squaresOfNumbers(input.nextInt());//Task 3
        //  smallerDivisor(input.nextInt());//Task 4
        //powOfTwo(input.nextInt()); //Task 5
        //descendingOrder(input.nextInt()); // Task 6
        // descendingOrderMultipleOfTwo(input.nextInt());// Task 7
        //inputNumberPowOfTwo();// Task 8
        // smallerIntegerPowOfTwo(input.nextInt());//Task 9
        //  printAscii();//10
        //  multipleOfThree(input.nextInt());// Task 11
        // fibonacci(input.nextInt()); //Task 12
        // athlete(input.nextDouble(), input.nextDouble());//Task 13
        //deposit(input.nextDouble(), input.nextDouble(), input.nextDouble());//Task 14
        // seqondMax(); //Task 15
        // guessNumber(); //Task 16
        sumOfDigits(input.nextInt());//Task 17
        input.close();
    }

    /**
     * Task 1
     *
     * @param
     */
    public static void numbers1of10() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    /**
     * Task 2
     *
     * @param
     */
    public static void evenNumbers1of20() {
        int i = 2;
        while (i <= 20) {
            System.out.println(i);
            i = i + 2;
        }
    }

    /**
     * Task 3
     *
     * @param number
     */
    public static void squaresOfNumbers(int number) {
        int i = 1;
        while (Math.pow(i, 2) < number) {
            System.out.println((int) Math.pow(i, 2));
            i++;
            number--;
        }
    }

    /**
     * Task 4
     *
     * @param n
     */
    public static void smallerDivisor(int n) {
        if (n > 2) {
            int i = 1;
            while (n >= 2) {
                i++;
                if ((n % i) == 0) {
                    System.out.println(i);
                    break;
                }
            }
        } else
            System.out.println("Small than 2");
    }

    /**
     * @param n
     * @return
     */
    public static boolean powerOfTwoBitwise(int n) {
        return (n & n - 1) == 0;
    }

    /**
     * Task 5
     *
     * @param i
     */
    public static void powOfTwo(int i) {
        for (int j = 1; j < i; j++) {
            if (powerOfTwoBitwise(j)) {
                System.out.println(j);
                if (j == i) {
                    break;
                }
            }
        }
    }

    /**
     * Task 6
     *
     * @param n
     */
    public static void descendingOrder(int n) {
        do {
            System.out.print(n + " ");
            n--;
        } while (n >= 0);
    }

    /**
     * Task 7
     *
     * @param n
     */
    public static void descendingOrderMultipleOfTwo(int n) {
        do {
            if (n % 2 == 0) {
                System.out.print(n + " ");
                n = n - 2;
            } else {
                n = n - 1;
            }
        } while (n > 0);
    }

    /**
     * Task 8
     */
    public static void inputNumberPowOfTwo() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            int i = scanner.nextInt();
            count++;
            if (powerOfTwoBitwise(i)) {
                System.out.println("i = " + i);
                System.out.println("Count of integers = " + count);
                break;
            }
            continue;
        }
    }

    /**
     * Task 9
     *
     * @param i
     */
    public static void smallerIntegerPowOfTwo(int i) {
        while (true) {
            if (powerOfTwoBitwise(i)) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }

    /**
     * Task 10
     */
    public static void printAscii() {
        int count = 0;
        for (int i = 32; i <= 122; i++) {

            System.out.print((char) i + " ");
            if (count % 10 == 0) {
                System.out.println();
            }
            count++;
        }
    }

    /**
     * Task 11
     *
     * @param n
     */
    public static void multipleOfThree(int n) {
        int i = 1;
        while (n > i) {
            i++;
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    /**
     * Task 12
     *
     * @param k
     */
    public static void fibonacci(int k) {

        int i, n1 = 0, n2 = 1, n3;
        // System.out.print(n1+" "+n2);
        int count = 0;
        for (i = 2; i < k + 1; ++i) {
            n3 = n1 + n2;
            // System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
            count++;
            if (n3 == k) {
                System.out.println("F(" + i + ") = " + k);
                return;
            }
        }
        if (count >= k - 1) {
            System.out.println(-1);
        }
    }

    /**
     * Task 13
     *
     * @param x
     * @param persent
     * @param y
     */
    public static void deposit(double x, double persent, double y) {
        int year = 0;
        while (true) {
            year++;
            x = x + x * 0.01 * persent;
            if ((int) x >= y) {
                System.out.println("Year = " + year);
                return;
            }
        }
    }

    /**
     * Task 14
     *
     * @param x
     * @param y
     */
    public static void athlete(double x, double y) {
        int day = 0;
        while (true) {
            day++;
            x = x + x * 0.1;
            // System.out.println("x = "+x);
            if (x >= y) {
                System.out.println("Day = " + day);
                return;
            } else if (x > y) {
                return;
            }
        }
    }

    /**
     * Task 15
     */
    public static void seqondMax() {
        Scanner input = new Scanner(System.in);
        int number;
        int firstMax = 0, secondMax = 0;
        do {
            number = input.nextInt();
            if (number >= firstMax) {
                firstMax = number;
                // System.out.print("FM = "+firstMax);
            }
            if (number >= secondMax && number < firstMax) {
                secondMax = number;
                // System.out.println("SM = "+secondMax);
            }

        } while (number != 0);
        System.out.println("Second max = " + secondMax);
    }

    /**
     * Task 16
     */
    public static void guessNumber() {
        Scanner input = new Scanner(System.in);
        int number = (int) (Math.random() * 10);
        while (true) {
            if (input.nextInt() > number) {
                System.out.println("Too high, try again");
            }
            if (input.nextInt() < number) {
                System.out.println("Too low, try again");
            }
            if (input.nextInt() == number) {
                System.out.println("Yes");
                return;
            }
        }
    }

    /**
     * Task 17
     * @param number
     */
    public static void sumOfDigits(int number){
        int sum=0;
         do{
                sum=sum+number%10;
                number=number/10;
        }while (number>0);
        System.out.println("Sum of digits = "+sum);
    }
}


