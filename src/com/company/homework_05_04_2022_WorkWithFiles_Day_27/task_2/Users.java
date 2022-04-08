package com.company.homework_05_04_2022_WorkWithFiles_Day_27.task_2;

import java.io.*;

public class Users {
    private String name;
    private String sureName;
    private int age;

    public Users() {
    }

    public Users(String name, String sureName, int age) {
        this.name = name;
        this.sureName = sureName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void saveUsers(File filename, Users[]users) throws IOException {
        FileWriter myWriter = new FileWriter("users.txt");
        for (int i = 0; i < users.length; i++) {
            myWriter.write("Name : "+users[i].getName()+" Surname : "+users[i].getSureName()+" Age : "+users[i].getAge()+"\n");

        }

        myWriter.close();

    }
    public static void getUsersFromFile(File filename) throws IOException {

        String line;
        String words[]=null;
        BufferedReader bufferedReader=new BufferedReader(new FileReader(filename));
        while ((line=bufferedReader.readLine())!=null) {
            words = line.split(" ");
        }
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]+" ");
        }
        System.out.println();
    }


}
