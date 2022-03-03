package com.company.Homework_03_03_2022_Day_20.Task_5;

import com.company.Homework_03_03_2022_Day_20.Task_5.InnerPackage.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.type = "ooo";
        System.out.println(dog.toString());
        dog.voice();
    }
}
