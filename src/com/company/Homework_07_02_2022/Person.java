package com.company.Homework_07_02_2022;

public class Person {
    String name;
    int age;
    String address;
    Person(){

    }
    Person(String name, int age, String address){
       this.address=address;
       this.age=age;
       this.name=name;
    }
    public void printInfoAboutPersons(){
        System.out.println("Name : "+name+"\nAge : "+age+"\nAddress : "+address);
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
