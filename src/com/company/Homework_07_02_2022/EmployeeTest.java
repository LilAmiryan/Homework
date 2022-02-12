package com.company.Homework_07_02_2022;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee e1=new Employee(1,"Lilit","IT",28,"female",0,0);
        Employee e2=new Employee(2,"Narek","IT",38,"male",1,2);
        Employee e3=new Employee(3,"Sona","Chemical",18,"female",3,4);
        Employee e4=new Employee(4,"Vardan","IT",48,"male",10000,7);
        Employee e5=new Employee(5,"Alisa","Design",28,"female", 5000,4);
        Employee e6=new Employee(6,"Satenik","Teacher",31,"female",9000,5);
        Employee e7=new Employee(7,"Angela","Synergy",27,"female",5200,9);

       e1.printINfoAboutEmployees();
       e2.printINfoAboutEmployees();
       e3.printINfoAboutEmployees();
       e4.printINfoAboutEmployees();
       e5.printINfoAboutEmployees();
       e6.printINfoAboutEmployees();
       e7.printINfoAboutEmployees();

    }
}
