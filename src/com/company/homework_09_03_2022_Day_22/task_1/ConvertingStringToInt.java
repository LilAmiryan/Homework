package com.company.homework_09_03_2022_Day_22.task_1;

import java.util.Scanner;

public class ConvertingStringToInt {
    static Scanner  input=new Scanner(System.in);

    public static int convertingStringToInt() {
        while (true) {
            String string=input.nextLine();

            for (int i = 0; i < string.length(); i++) {
                try {
                    return Integer.parseInt(string);
                }catch (NumberFormatException e){
                   // e.printStackTrace();
                    System.out.println("Incorrect type");

                }
            }
        }
    }
}
