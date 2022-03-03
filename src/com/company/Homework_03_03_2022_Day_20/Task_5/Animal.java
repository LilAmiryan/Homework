package com.company.Homework_03_03_2022_Day_20.Task_5;

public abstract class Animal {
    protected String type;

    public abstract void voice();

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                '}';
    }
}
