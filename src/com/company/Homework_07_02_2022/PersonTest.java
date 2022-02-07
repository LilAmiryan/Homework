package com.company.Homework_07_02_2022;

import com.company.Homework_07_02_2022.Person;

public class PersonTest {

    public static void main(String[] args) {

        Person person1 = new Person("Sona", 28, "Mantashyan 18/4");
        Person person2 = new Person("Gevorg", 20, "Paronynanc 20/1");
        // System.out.println(person1.toString());
        //System.out.println(person2.toString());
        person1.printInfoAboutPersons();
        person2.printInfoAboutPersons();
    }
}
