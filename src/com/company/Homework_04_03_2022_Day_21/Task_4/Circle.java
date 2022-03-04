package com.company.Homework_04_03_2022_Day_21.Task_4;

public class Circle implements Shape{
    private int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println(Math.PI*Math.pow(radius,2));
    }

    @Override
    public void perimetr() {
        System.out.println(2*Math.PI*radius);
    }
}
