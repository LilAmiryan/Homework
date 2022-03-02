package com.company.Homework_02_03_2022_Day_19.Task_3;

public class ItCompany {
    private int countOfEmployers;
    private String companyName;

    public ItCompany() {
    }

    public ItCompany(int countOfEmployers, String companyName) {
        this.countOfEmployers = countOfEmployers;
        this.companyName = companyName;
    }

    public void setCountOfEmployers(int countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getCountOfEmployers() {
        return countOfEmployers;
    }

    public String getCompanyName() {
        return companyName;
    }
    protected void account(){
        System.out.println("ItCompany");
    }

    @Override
    public String toString() {
        return "ItCompany{" +
                "countOfEmployers=" + countOfEmployers +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
