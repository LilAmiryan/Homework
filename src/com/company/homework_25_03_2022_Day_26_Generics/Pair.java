package com.company.homework_25_03_2022_Day_26_Generics;

public interface Pair<T1, T2> {
    <T1> T1 getKey();

    <T2> T2 getValue();
}
