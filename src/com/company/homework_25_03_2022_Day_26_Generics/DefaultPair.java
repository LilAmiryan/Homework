package com.company.homework_25_03_2022_Day_26_Generics;

public class DefaultPair <T1, T2> implements Pair<T1,T2>{
    T1 value;
    T2 key;

    DefaultPair(T1 value, T2 key){
        this.value=value;
        this.key=key;
    }
    @Override
    public T2 getKey() {
        return key;
    }

    @Override
    public T1 getValue() {
        return value;
    }
}
