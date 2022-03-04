package com.company.Homework_04_03_2022_Day_21.ImmutableToMutable;

public final class Car {
    private final int year;
    private  final String model;
    private  final String mark;
    private  final Engine engine;

    public Car(){
        this(0,null,null,null);
    }
    public Car(final int year, final String model, final String mark, final Engine engine) {
        this.year = year;
        this.model = model;
        this.mark = mark;
        this.engine = new Engine(engine);
    }

    public Engine getEngine() {
        return new Engine(engine);
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", mark='" + mark + '\'' +
                ", engine=" + engine +
                '}';
    }

}
