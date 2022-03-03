package com.company.Homework_03_03_2022_Day_20.Task_5.InnerPackage;

import com.company.Homework_03_03_2022_Day_20.Task_5.Animal;

public class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Dog's voice");
    }

    @Override
    public String toString() {
        return "Dog{} " + super.toString();
    }
}
