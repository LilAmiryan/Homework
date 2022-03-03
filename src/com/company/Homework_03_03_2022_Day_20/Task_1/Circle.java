package com.company.Homework_03_03_2022_Day_20.Task_1;


public  class Circle extends Shape {
    private final double PI=3.14;
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    protected double getArea() {
        return PI*Math.pow(radius,2);
    }

    @Override
    protected double getPerimeter() {
        return 2*PI*radius;
    }
}
