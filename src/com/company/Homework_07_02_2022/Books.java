package com.company.Homework_07_02_2022;

public class Books {
    String name;
    Author author;
    int price;

    Books(){}
    Books(String name, Author author, int price){
        this.name=name;
        this.author=author;
        this.price=price;
    }
    public void printAllInformationAboutBook(){
        System.out.println("Name : "+name+"\nAuthor's name : "+author.name+"\nAuthor's email"+author.email+"\nPrice : "+price);
    }
}
