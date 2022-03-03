package com.company.Homework_03_03_2022_Day_20.Task_1;

public class Square extends Shape {
    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    protected double getArea() {
        return Math.pow(side,2);
    }

    @Override
    protected double getPerimeter() {
        return 4*side;
    }
}
