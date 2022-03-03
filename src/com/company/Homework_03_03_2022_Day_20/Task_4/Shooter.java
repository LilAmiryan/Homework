package com.company.Homework_03_03_2022_Day_20.Task_4;

public class Shooter extends Warrior{

    @Override
    public void hit() {
        System.out.println("Shooter's hit");
    }

    @Override
    public String toString() {
        return "Shooter{} " + super.toString();
    }
}
