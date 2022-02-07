package com.company.Homework_07_02_2022;

public class Author {
    String name;
    String email;
    char gender;

    Author(){

    }
    Author(String name, String email, char gender){
      this.email=email;
      this.name=name;
      this.gender=gender;
    }
    public void printINfoAboutAuthorss(){
        System.out.println("Name : "+name+"\nID : "+"\nGender : "+gender+"\nEmail : "+email);
    }
}
