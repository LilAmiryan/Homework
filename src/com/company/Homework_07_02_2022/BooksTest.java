package com.company.Homework_07_02_2022;

public class BooksTest {
    public static void main(String[] args) {

        Author author=new Author("Lilit","la@",'m');
        Books book1=new Books("Harry Poter",author,123);
        Books book2=new Books("Marry me",author,123);
        book1.printAllInformationAboutBook();
        System.out.println();
        book2.printAllInformationAboutBook();
    }
}
