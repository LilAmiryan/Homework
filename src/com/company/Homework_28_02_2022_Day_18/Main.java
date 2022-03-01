package com.company.Homework_28_02_2022_Day_18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /**
         * Task 1,2
         */
       /* Person person=new Person("Lilit","Amiryan","AA11",28,"F","Arm");
        Person person1=new Person();
        int age=19;
        if (Validator.intRange(age)){
            person1.setAge(age);
        }
        if(Validator.FirstNameLengthRange("abcdefg")){
            person1.setFirstName("abcdefg");
        }
        if (Validator.isPassprtIdValid("AN124785")){
            person1.setPassportId("AN124785");
        }
        person1.display();

        */ //Task 1,2

/**
 * Task 3
 */
/*
        Triangle triangle = new Triangle();
        byte sideA = input.nextByte();
        byte sideB = input.nextByte();
        byte sideC = input.nextByte();
        if (Validator.isValidSide(sideA))
            triangle.setSideA(sideA);
        if (Validator.isValidSide(sideB))
            triangle.setSideB(sideB);
        if (Validator.isValidSide(sideC))
            triangle.setSideC(sideC);
        triangle.areaOrPerimetr(triangle.getSideA(), triangle.getSideB(), triangle.getSideC());

 */
        /**
         * Task 4
         */
        Store store=new Store();
        int countOfWorker=input.nextInt();
        if (Validator.isCountOfWorkerValid(countOfWorker)){
            store.setCountOfWorkers(countOfWorker);
        }
        String name=input.next();
        if(Validator.isNameCharacterLeast3(name)){
            store.setName(name);
        }
        String phoneNumber=input.next();
        if(Validator.isPhoneNumberValid(phoneNumber))
            store.setPhoneNumber(phoneNumber);

        int productNumber[]={4,5,8,9,2};
        store.setProductNumbers(productNumber);
        System.out.println( store.toString());

    }

}
