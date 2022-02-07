package com.company.Homework_07_02_2022;

public class Employee {
   int id;
   String name;
   String department;
   int age;
   String gender;

   Employee(){

   }
   Employee(int id, String name, String department, int age, String gender){
       this.age=age;
       this.name=name;
       this.id=id;
       this.gender=gender;
       this.department=department;
   }

   public void printINfoAboutEmployees(){
       System.out.println("Name : "+name+"\nID : "+id+"\nAge : "+age+"\nGender : "+gender+"\nDepartment : "+department);
   }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }


}
