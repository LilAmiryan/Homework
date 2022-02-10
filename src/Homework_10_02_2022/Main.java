package Homework_10_02_2022;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //evenNumber(input.nextInt());//Task 2
        //System.out.println(randomNumber());//Task 3
        // System.out.println(max(input.nextInt(),input.nextInt(),input.nextInt())); //Task 5
        // floatNumber(input.nextFloat()); //Task 6
        // iceCream(input.nextInt()); //Task 8
        // leapYear(input.nextInt());//Task 9
        //ab(input.nextInt(), input.nextInt());//Task 10
        // equalsNumbersCount(input.nextInt(), input.nextInt(), input.nextInt());//Task 13
        discriminant(input.nextInt(),input.nextInt(),input.nextInt());//Task 14
        input.close();
    }

    /**
     * Task 2
     *
     * @param number
     */
    public static void evenNumber(int number) {
        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even.");
        } else
            System.out.println("Number " + number + " is not even.");

    }

    /**
     * Task 3
     *
     * @return
     */
    public static int randomNumber() {
        Random random = new Random();
        //formula is ((max - min) + 1) + min
        return random.nextInt(6) + 2;
    }

    /**
     * Task 5
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int max(int a, int b, int c) {
        if (a >= b && b >= c)
            return a;
        if (b >= a && a >= c)
            return b;
        if (c >= a && a >= b)
            return c;
        else
            return 0;
    }

    /**
     * Task 6
     *
     * @param f
     */
    public static void floatNumber(float f) {
        if (f == 0)
            System.out.println("Zero");
        else if (f > 0)
            System.out.println("Positive");
        else
            System.out.println("Negative");

        if (Math.abs(f) < 1) {
            System.out.println("Small");
        }
        if (Math.abs(f) > 1000000) {
            System.out.println("Large");
        }

    }

    /**
     * Task 8
     *
     * @param k
     */
    public static void iceCream(int k) {
        if (k % 3 == 0 || k % 5 == 0  || k % 5 == 3) {
            System.out.println("You can by " + k + " balls ice cream.");
        } else
            System.out.println("You can't by " + k + " balls ice cream.");
    }

    /**
     * Task 9
     *
     * @param year
     */
    public static void leapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap year.");
                } else System.out.println("Not leap year.");
            } else
                System.out.println("Leap year.");
        } else
            System.out.println("Not leap year.");
    }

    /**
     * Task 10
     *
     * @param a
     * @param b
     */
    public static void ab(int a, int b) {
        if (a % 7 == 0 || b % 7 == 0) {
            if ((a * b) > 1 && a > b) {
                for (int j = a; j >= b; j--) {
                    if (j % 2 == 1)
                        System.out.println(j);
                }
            }
        } else {
            for (int j = a; j <= b; j++) {
                if (j % 2 == 0)
                    System.out.println(j);
            }
        }
    }

    /**
     * Task 13
     *
     */
    public static void equalsNumbersCount(int a, int b, int c) {
        int count = 0;
        if (a == b && a == c) {
            count = 3;
        } else if (a == b || a == c || b == c)
            count = 2;
        System.out.println(count);
    }

    /**
     * Task 14
     * @param a
     * @param b
     * @param c
     */
    public static void discriminant(int a, int b, int c){
        double d=Math.pow(b,2)-4*a*c;
        if(d>0){
            double x1=(-b+Math.sqrt(d))/4;
            double x2=(-b-Math.sqrt(d))/4;
            System.out.println("Roots are "+x1+"\t"+x2);
        }
       else if (d==0){
            System.out.println("Roots are same "+(-b/2*a));
        }
        else
            System.out.println("Can't be");

    }

}
