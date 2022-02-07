package com.company.Homework_04_02_2022;

import java.util.Scanner;

public class Main {

    /**
     * Task 1
     * Doing casting variables types low to high
     *
     * @param b
     */
    public static void castingLowToHigh(byte b) {
        short sh = b;
        System.out.println("sh = " + sh + " b = " + b);
        int i = sh;
        System.out.println("i = " + i + " sh = " + sh);
        long l = i;
        System.out.println("l = " + l + " i = " + i);
        float f = l;
        System.out.println("f = " + f + " l = " + l);
        double d = f;
        System.out.println("d = " + d + " f = " + f);

    }

    /**
     * Task 2
     * Doing casting variables types hogh to low
     *
     * @param d
     */
    public static void castingHighToLow(double d) {
        float f = (float) d;
        System.out.println("d = " + d + " f = " + f);
        long l = (long) f;
        System.out.println("l = " + l + " f = " + f);
        int i = (int) l;
        System.out.println("i = " + i + " l = " + l);
        short sh = (short) i;
        System.out.println("sh = " + sh + " i = " + i);
        byte b = (byte) sh;
        System.out.println("b = " + b + " sh = " + sh);
    }

    /**
     * Task 3
     * Convert temperature from Fahrenheit to
     * Celsius degree
     *
     * @param fahrenheit
     */
    public static void farenheitToCelsuse(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature  " + fahrenheit + " Fahrenheit is " + celsius + " Celsius degree");
    }

    /**
     * Task 4
     * Count area of circle
     * @param r
     */
    public static void area(double r){
        System.out.println("Area of circle is "+Math.PI*Math.pow(r,2));
    }

    /**
     * Task 4
     * Count perimeter of circle
     * @param r
     */
    public static void perimeter(double r){
        System.out.println("Perimeter of circle is "+2*Math.PI*r);
    }

    /**
     * Task 5
     * Doing print the result of this expression 1 / 3
     */
    public static void expressionOfDevorse(){
        double d=(double) 1/3;
        System.out.println("Result of this expression 1 / 3 as a double "+d);
        float f= 1/3f;
        System.out.println("Result of this expression 1 / 3 as a float "+f);
    }

    /**
     * Task 6
     *
     */
    public static void printNameWithChar(){
        System.out.println(""+'L'+'i'+'l'+'i'+'t'+" "+1993);
    }

    /**
     * Task 7
     * Doing cast char to int
     * @param ch
     */
    public static void castCharToInt(char ch){
        System.out.println("The UNICODE is "+(int)ch);
    }

    /**
     * Task 8
     * Cast name letters and find average
     * @param name
     */
    public  static void nameUnicodeAverage(String name){
        int count=0;
        for(int i=0;i<name.length();i++){
            System.out.print((int) name.charAt(i)+" ");
            count=count+(int)name.charAt(i);
        }
        System.out.print("Average of your name's unicode is "+ count/name.length());
    }

    /**
     * Task 9
     * Input int value from console, find char value corresponding to that int value.
     * @param number
     */
    public static void correspondingValueOfInteger(int number){
        if (number>=32 && number<=127){
            System.out.print("Corresponding of "+number+" value is "+(char)number);
        }
        else
            System.out.print("Input number in range 32 to 127 ");

    }

    /**
     * Task 10
     * @param n1
     * @param n2
     */
    public  static  void concatOfTwoStrings(String n1, String n2){
        System.out.println(n1+" "+n2);

    }



    /**
     * Task 11
     * Cpncatenate string and another primitive type
     * @param string
     * @param i
     * @param ch
     */
    public static void concatOfDefferentType(String string, int i, char ch){
        System.out.println("String concat with int");
        System.out.println(string+i);
        System.out.println("int concat with int");
        System.out.println(i+i);
        System.out.println("String concat with int and char");
        System.out.println(string+i+ch);
    }

    /**
     * Task 12
     */
    public static void printText(){
        System.out.println("We are the so-called \"Vikings\" from the north.");
        System.out.println("We are the\n so-called \"Vikings\" from the north.");
        System.out.println("We are the\t so-called \"Vikings\" from the north.");
        System.out.println("We are the\b so-called \"Vikings\" from the north.");
    }


    /**
     * Task14
     *  Swap 2 integers without using temp.
     * @param a
     * @param b
     */
    public static void swap(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Swap\na = "+a+"\tb = "+b);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // byte b=input.nextByte();

        // double d=input.nextDouble();

        /*
        System.out.print("Enter temperature (Fahrenheit) ");
        double fahrenheit=input.nextDouble();
        */

       /* System.out.print("Input radius ");
        double radius=input.nextDouble();*/

        //  castingLowToHigh(b);
        //  castingHighToLow(d);
        //  farenheitToCelsuse(fahrenheit);
       /*
       area(radius);
        perimeter(radius);
        */
        //expressionOfDevorse();

        //  printNameWithChar();

       /* System.out.print("Input any symbol ");
        char ch= input.next().charAt(0);
        castCharToInt(ch);*/

     /*   System.out.print("Input your name ");
        String name=input.next();
        nameUnicodeAverage(name);*/

      /*  System.out.print("Input any number in range 32 to 127 ");
        int number=input.nextInt();
        correspondingValueOfInteger(number);*/


       /* System.out.println("Input two name ");
        String n1=input.next();
        String n2=input.next();
        concatOfTwoStrings(n1, n2);
        */

      /*  System.out.print("Input a String variable ");
        String string=input.next();
        System.out.print("Input an Integer variable ");
        int i=input.nextInt();
        System.out.print("Input an Char variable ");
        char ch=input.next().charAt(0);
        concatOfDefferentType(string,i, ch);
        */
        // printText();
        int a=input.nextInt();
        int b= input.nextInt();
        System.out.println("a = "+a+"\tb = "+b);
        swap(a,b);
        input.close();

    }
}
