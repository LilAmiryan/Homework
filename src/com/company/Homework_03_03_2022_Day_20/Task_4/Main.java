package com.company.Homework_03_03_2022_Day_20.Task_4;

public class Main {
    public static void main(String[] args) {

        Shooter shooter = new Shooter();
        shooter.setName("Gor");
        shooter.hit();
        System.out.println(shooter.toString());
        SwordsMen swordsMen=new SwordsMen();
        swordsMen.setName("Aram");
        swordsMen.hit();
        System.out.println(swordsMen.toString());
    }
}
