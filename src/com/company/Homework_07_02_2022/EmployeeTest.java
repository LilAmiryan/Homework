package com.company.Homework_07_02_2022;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee e1=new Employee(1,"Lilit","IT",28,"female");
        Employee e2=new Employee(1,"Narek","IT",38,"male");
        Employee e3=new Employee(1,"Sona","Chemical",18,"female");
        Employee e4=new Employee(1,"Vardan","IT",48,"male");
        Employee e5=new Employee(1,"Alisa","Design",28,"female");


       e1.printINfoAboutEmployees();
       e2.printINfoAboutEmployees();
       e3.printINfoAboutEmployees();
       e4.printINfoAboutEmployees();
       e5.printINfoAboutEmployees();

    }
}
