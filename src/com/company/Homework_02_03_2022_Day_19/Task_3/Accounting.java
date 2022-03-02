package com.company.Homework_02_03_2022_Day_19.Task_3;

public class Accounting extends ItCompany{
    private String departmentName;

    public Accounting(){
        super();
    }

    public Accounting(int countOfEmployers, String companyName, String departmentName) {
        super(countOfEmployers, companyName);
        this.departmentName = departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    protected void account() {
        System.out.println("Accounting");
    }

    @Override
    public String toString() {
        return "Accounting{" +
                "departmentName='" + departmentName + '\'' +
                '}';
    }
}
