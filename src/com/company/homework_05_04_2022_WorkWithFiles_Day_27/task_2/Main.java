package com.company.homework_05_04_2022_WorkWithFiles_Day_27.task_2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Users users[] = new Users[2];
        users[0] = new Users("A", "A", 1);
        users[1] = new Users("B", "B", 2);
        Scanner input = new Scanner(System.in);
        File file = new File("users.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        for (int i = 0; i < users.length; i++) {

            users[i] = new Users();
            System.out.print("Name : ");
            users[i].setName(input.next());

            System.out.print("SureName : ");
            users[i].setSureName(input.next());

            System.out.print("Age : ");
            users[i].setAge(input.nextInt());

            // users[i].saveUsers(file,users);
            Users.getUsersFromFile(file);
        }
        Users.saveUsers(file, users);
        //Users.getUsersFromFile(file);

    }
}
