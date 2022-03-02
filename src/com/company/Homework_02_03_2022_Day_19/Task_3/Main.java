package com.company.Homework_02_03_2022_Day_19.Task_3;

public class Main {
    public static void main(String[] args) {

        ItCompany itCompany=new ItCompany(5,"Name of company");
        itCompany.account();
        System.out.println(itCompany.toString());

        System.out.println();

        Accounting accounting=new Accounting(7,"Uf uf","Name of Department ");
        accounting.account();
        System.out.println(accounting.toString());

        System.out.println();

        TaxAccounting taxAccounting=new TaxAccounting();
        taxAccounting.account();

        System.out.println();

        Accounting accounting1=new TaxAccounting();
        accounting1.account();

        System.out.println();

        ItCompany taxAccounting1=new TaxAccounting();
        taxAccounting1.account();

        System.out.println();

        FinancialAccount financialAccount=new FinancialAccount();
        financialAccount.account();

        System.out.println();

        Marketing marketing=new Marketing();
        marketing.marketing();

        System.out.println();

        SMM smm=new SMM();
        smm.marketing();

        System.out.println();

        Marketing smm1=new SMM();
        smm1.marketing();

        System.out.println();

        SEO seo=new SEO();
        seo.marketing();

        System.out.println();

        ItCompany marketing1=new Marketing();
        marketing1.account();


    }
}
