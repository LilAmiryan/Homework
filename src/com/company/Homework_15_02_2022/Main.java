package com.company.Homework_15_02_2022;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //evenNumbers(input.nextInt(), input.nextInt());//Task 1
        //remainder(input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt());//Task 2
        squares(input.nextInt(),input.nextInt());//Task 3
        //occursOfNumber(input.nextInt(), input.nextInt());//Task 4
        // reverse(input.nextInt());//Task 5
        //smalestDivisor(input.nextInt());//Task 6
        //allDivisors(input.nextInt());//Task 7
        //countOfDivisors(input.nextInt());//Task 8
       // sumOfTenNumbers();//Task 9
       // binaryToDigit(input.nextInt());//10
        //zeroPositivNegativ(input.nextInt());//Task 11
       // gnche_1(input.nextInt()); //Task 12
        //rectangle(input.nextInt()); //Task 13
        //otherRectangle(input.nextInt());//Task 14
        //  coolRectangle(input.nextInt());//Task 15 :(
        /*triangleA();
        triangleB();
        triangleC();
        triangleD();*/ //Task 16
    }

    /**
     * Task 1
     *
     * @param i
     * @param j
     */
    public static void evenNumbers(int i, int j) {
        for (int k = i; k <= j; k++) {
            if (k % 2 == 0) {
                System.out.println(k);
            }
        }
    }

    /**
     * Task 2
     *
     * @param a
     * @param b
     * @param d
     * @param c
     */
    public static void remainder(int a, int b, int d, int c) {
        for (int i = a; i <= b; i++) {
            if (i % d == c) {
                System.out.println(i);
            }
        }
    }

    /**
     * Task 3
     *
     * @param a
     * @param b
     */
    public static void squares(int a, int b) {
        int a1=(int)Math.sqrt(a);
        int b1=(int)Math.sqrt(b);

        for (int i = a; i <= b; i++) {
           // System.out.println(i);

            for (int l = a1;l<b;l++){
                if((l*l)==i){
                    System.out.println(i);
                }
            }

        }

        // System.out.println(2.0-2);
    }

    /**
     * TAsk 4
     *
     * @param x
     * @param d
     */
    public static void occursOfNumber(int x, int d) {
        int count = 0, c = 0;
        int l;
        int k = x;
        do {
            count++;
            x = x / 10;
        } while (x > 0);
        // System.out.println(count);
        for (int i = 0; i < count; i++) {
            l = k % 10;
            k = k / 10;
            if (l == d) {
                c++;
            }

        }
        System.out.println(c);

    }

    /**
     * Task 5
     *
     * @param x
     */
    public static void reverse(int x) {
        int l;
        int k = x;
        int count = 0, newN = 0;
        do {
            count++;
            x = x / 10;
        } while (x > 0);
        int count2 = count;
        for (int i = 0; i < count; i++) {
            l = k % 10;
            k = k / 10;
            //System.out.println(l);
            count2--;
            newN = newN + (l * (int) Math.pow(10, count2));
        }
        System.out.println(newN);
    }

    /**
     * Task 6
     *
     * @param x
     */
    public static void smalestDivisor(int x) {
        if (x >= 2 && x < 30000) {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    System.out.println(i);
                    return;
                }
            }
        }

    }

    /**
     * Task 7
     *
     * @param x
     */
    public static void allDivisors(int x) {
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.println(i);

            }

        }

    }

    /**
     * Task 8
     * @param x
     */
    public static void countOfDivisors(int x) {
        int count = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Count of divisors "+count);
    }

    /**
     * Task 9
     */
    public static void sumOfTenNumbers(){
        Scanner input=new Scanner(System.in);
        int sum=0;
        for (int i=0;i<10;i++){
            sum=sum+input.nextInt();
        }
        System.out.println(sum);
    }

    /**
     * Task 10
     * @param b
     */
    public static void binaryToDigit(int b){
        int l;
        int k = b;
        int number=0;
        int count = 0, newN = 0;
        do {
            count++;
            b = b / 10;
        } while (b > 0);
        int count2 = count;
        for (int i = 0; i < count; i++) {
            l = k % 10;
            k = k / 10;
          //  System.out.println(l);
            number=number+l*(int) Math.pow(2,i);

        }
        System.out.println(number);
    }

    /**
     * Task 11
     * @param n
     */
    public static void zeroPositivNegativ(int n){
        Scanner input=new Scanner(System.in);
        int number=0;
        int countZ=0, countP=0,countN=0;
        for (int i=0;i<n;i++){
            number=input.nextInt();
            if(number==0){
                countZ++;
            }
            if(number>0){
                countP++;
            }
            if(number<0){
                countN--;
            }
        }
        System.out.println("Count of Zero "+countZ+" Count of Positiv "+countP+" Count of Negative "+countN);

    }

    /**
     * Task 12
     * @param number
     */
    public static void gnche_1(int number){
        int count=0;
        for (int i=1;i<=number;i++){
            for(int j=i;j>=1;j--) {
                System.out.println(i);
                count++;
                if(count==number)
                    return;
            }
        }
    }

    /**
     * Task 13
     * @param n
     */
    public static void rectangle(int n){
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print('*'+" ");
            }
            System.out.println();
        }
    }

    /**
     * Task 14
     * @param n
     */
    public static void otherRectangle(int n){
        boolean b=false;
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(b==false) {
                    System.out.printf("# ");
                }
                else
                    System.out.print(" #");
            }
            if(b)
                b=false;
            else b=true;
            System.out.println(" ");
        }
    }

    /**
     * :(
     * @param n
     */
    public static void coolRectangle(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if(i==j) {
                    System.out.print(" "+j + " ");
                }
                //System.out.println();
                if(i==2) {
                    if(i%2==0)
                    System.out.print(" "+j+"");
                }
            }
        }

    }

    /**
     * Task 16
     */
    public static void triangleC(){
        System.out.printf("%6s%n%6s%n%6s%n%6s%n%6s%n%6s", "******", "*****", "****", "***", "**", "*");

    }
    public static void triangleD(){
        System.out.printf("%6s%n%6s%n%6s%n%6s%n%6s%n%6s", "*", "**", "***", "****", "*****", "******");

    }
    public static void triangleA(){
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s", "*", "**", "***", "****", "*****", "******");

    }
    public static void triangleB(){
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s", "******", "*****", "****", "***", "**", "*");

    }

}


