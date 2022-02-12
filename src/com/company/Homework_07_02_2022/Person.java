package com.company.Homework_07_02_2022;

public class Person {
    static int count=0;
    String name;
    int age;
    String address;
    Person(){

    }
    Person(String name, int age, String address){
       this.address=address;
       this.age=age;
       this.name=name;
       count++;
    }
    public static void printInfoAboutPersons(Person person){
        System.out.println("Name : "+person.name+"\nAge : "+person.age+"\nAddress : "+person.address);
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
