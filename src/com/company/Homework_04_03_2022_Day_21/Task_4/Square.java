package com.company.Homework_04_03_2022_Day_21.Task_4;

public class Square implements Shape{
    private int a;

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public void area() {
        System.out.println(a*a);
    }

    @Override
    public void perimetr() {
        System.out.println(4*a);
    }

}
