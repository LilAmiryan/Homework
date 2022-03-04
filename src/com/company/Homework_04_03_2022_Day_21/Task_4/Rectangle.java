package com.company.Homework_04_03_2022_Day_21.Task_4;

public class Rectangle implements Shape{
    private int a,b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public void area() {
        System.out.println(a*b);
    }

    @Override
    public void perimetr() {
        System.out.println(2*a+2*b);
    }
}
