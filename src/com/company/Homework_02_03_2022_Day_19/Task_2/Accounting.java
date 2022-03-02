package com.company.Homework_02_03_2022_Day_19.Task_2;

public class Accounting {
    private int countOfEmployers;
    private String departmentName;

    public Accounting() {
    }

    public Accounting(int countOfEmployers, String departmentName) {
        this.countOfEmployers = countOfEmployers;
        this.departmentName = departmentName;
    }

    public void setCountOfEmployers(int countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getCountOfEmployers() {
        return countOfEmployers;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    protected void account() {

    }
}
