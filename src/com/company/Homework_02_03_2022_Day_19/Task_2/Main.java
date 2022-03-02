package com.company.Homework_02_03_2022_Day_19.Task_2;

public class Main {
    public static void main(String[] args) {
        FinancialAccount financialAccount=new FinancialAccount();
        financialAccount.account();//salryOfEployeers

        TaxAccounting taxAccounting=new TaxAccounting();
        taxAccounting.account();//taxOfCompany

        TaxAccounting taxAccounting1=new FinancialAccount();//salryOfEployeers
        taxAccounting1.account();
    }

}
