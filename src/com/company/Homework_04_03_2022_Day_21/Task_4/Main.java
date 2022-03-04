package com.company.Homework_04_03_2022_Day_21.Task_4;

public class Main {
    public static void main(String[] args) {
        Square square=new Square();
        square.setA(5);
        Circle circle=new Circle();
        circle.setRadius(4);
        Rectangle rectangle=new Rectangle();
        rectangle.setA(2);
        rectangle.setB(3);
        Shape shape[] = {square,circle,rectangle};
        for (int i = 0; i < shape.length; i++) {
            shape[i].area();
            shape[i].perimetr();
        }
    }
}
