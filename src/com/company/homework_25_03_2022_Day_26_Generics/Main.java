package com.company.homework_25_03_2022_Day_26_Generics;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList();
        list.add("B");
        list.add("C");
        list.add("K");
        list.add("A");

        List<Number> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(6);

        List<Integer> integers = new ArrayList<>();
        integers.add(40);
        integers.add(20);
        integers.add(61);


        copy(numbers,integers);
        //printList(list);//Task 1
        Integer array[] = {1, 5, 4, 7};
        //printList(array);//Task 2
       /* maxValue(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1.charAt(0) >= o2.charAt(0)) ? 1 : -1;
            }
        });*/ //Task 3

        DefaultPair defaultPair=new DefaultPair(12,"Value");
        System.out.println("key = "+defaultPair.getKey()+" value = "+defaultPair.getValue());

    }

    /**
     * Task 1. Write a method which takes a list of any type and prints the elements of the list.
     *
     * @param t
     * @param <T>
     */
    public static <T> void printList(T t) {
        System.out.println(t);
    }

    /**
     * Task 2. Write a method that takes an array of T type and converts it to a list of type T.
     *
     * @param t
     * @param <T>
     */
    public static <T> void printList(T[] t) {
        List<T> list = new ArrayList<>();

        for (int i = 0; i < t.length; i++) {
            list.add(t[i]);
        }
        System.out.println(list);
    }

    /**
     * Task 3. Write a method which takes a List of T type and Comparator of type T. Return the largest value in the list.
     *
     * @param list
     * @param comparator
     * @param <T>
     */
    public static <T> void maxValue(List<T> list, Comparator<T> comparator) {
        T max = list.get(0);
        for (int i = 0; i < list.size() - 1; i++) {

            if (comparator.compare(list.get(i + 1), max) < 0) {
                max = list.get(i + 1);
            }
        }
        System.out.println(max);
    }

    /**
     * Task 4. Define a method copy(dest, src) which will copy from src to dest. src and dest are lists.
     *
     * @param dest
     * @param src
     */
    public static <T> void copy(List<T> dest, List<? extends T> src) {
        for (int i = 0; i < dest.size(); i++) {
            dest = (List<T>) src;
        }
        System.out.println(dest);
        System.out.println(src);
    }


}

