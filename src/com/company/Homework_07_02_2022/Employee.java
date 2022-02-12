package com.company.Homework_07_02_2022;

public class Employee {
   int id;
   String name;
   String department;
   int age;
   String gender;
   int salary;
   int experience;


   Employee(){
    this(0, "default","unknown,0,'/u0000",0,null,0,0);
   }
   Employee(int id, String name, String department, int age, String gender,int salary, int experience){
       this.age=age;
       this.name=name;
       this.id=id;
       this.gender=gender;
       this.department=department;
       this.salary=salary;
      this.experience=experience;
   }


   public void printINfoAboutEmployees(){
       System.out.println("Name : "+name+"\nID : "+id+"\nAge : "+age+"\nGender : "+gender+"\nDepartment : "+department+"\nSalary : "+salary+"\nExperience : "+experience);
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
