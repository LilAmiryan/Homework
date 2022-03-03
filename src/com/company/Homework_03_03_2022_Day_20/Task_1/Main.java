package com.company.Homework_03_03_2022_Day_20.Task_1;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.setRadius(4);
        System.out.println("Area of circle " + circle.getArea());
        System.out.println("Perimetr of circle " + circle.getPerimeter());
        System.out.println();

        Square square = new Square();
        square.setSide(6);
        square.getPerimeter();
        square.getArea();
        System.out.println();

    }
}
