package com.company.Homework_04_03_2022_Day_21.ImmutableToMutable;

public class Main {
    public static void main(String[] args) {
        Engine engine=new Engine(10,20,30);

        Car lamborghini = new Car(2020, "Lamborghini", "Avendator", engine);
        String model = lamborghini.getModel();
        lamborghini.getEngine().setHorsePow(100);
        System.out.println(lamborghini.toString());
        engine.setHorsePow(500);
        System.out.println(lamborghini.toString());


    }
}
