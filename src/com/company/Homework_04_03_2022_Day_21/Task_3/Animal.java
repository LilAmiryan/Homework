package com.company.Homework_04_03_2022_Day_21.Task_3;

public class Animal {
    private int age;
    private String name;


    public Animal() {

    }
    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName(String animal) {
        return name;
    }

    public void sound(){
        System.out.println("Animal");
    }
}
