package com.company.homework_05_04_2022_WorkWithFiles_Day_27.task_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String line;
        String words[]=null;
        File file=new File("newFile.txt");
        while (!file.exists()){
            file.createNewFile();
        }
        BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
        while ((line=bufferedReader.readLine())!=null){
            words=line.split("Hello");
        }
        System.out.println("Count of 'Hello' word is "+words.length);
        bufferedReader.close();
    }
}
