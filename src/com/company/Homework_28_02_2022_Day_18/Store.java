package com.company.Homework_28_02_2022_Day_18;

import java.util.Arrays;

public class Store {
    private int countOfWorkers;
    private String name;
    private String phoneNumber;
    int [] productNumbers;

    public Store() {}

    public Store(int countOfWorkers, String name, String phoneNumber, int[] productNumbers) {
        this.countOfWorkers = countOfWorkers;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.productNumbers = productNumbers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        this.countOfWorkers = countOfWorkers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setProductNumbers(int[] productNumbers) {
        this.productNumbers = productNumbers;
    }

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int[] getProductNumbers() {
        return productNumbers;
    }

    @Override
    public String toString() {
        return "Store{" +
                "countOfWorkers=" + countOfWorkers +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", productNumbers=" + Arrays.toString(productNumbers) +
                '}';
    }
}
