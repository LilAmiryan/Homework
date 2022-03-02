package com.company.Homework_02_03_2022_Day_19.Task_3;

public class TaxAccounting extends Accounting {
    public TaxAccounting() {
    }



    public TaxAccounting(int countOfEmployers, String companyName, String departmentName) {
        super(countOfEmployers, companyName, departmentName);
    }

    @Override
    protected void account() {
        System.out.println("taxOfCompany");
    }


}
