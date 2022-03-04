package com.company.Homework_04_03_2022_Day_21.ImmutableToMutable;

public class Engine {
    private int horsePow;
    private int milage;
   private int weight;

    public Engine() {
    }

    public Engine(int horsePow, int milage, int weight) {
        this.horsePow = horsePow;
        this.milage = milage;
        this.weight = weight;
    }

    public Engine(Engine engine){
        super();
        this.horsePow= engine.horsePow;
        this.milage= engine.milage;
        this.weight= engine.weight;
    }
    public void setHorsePow(int horsePow) {
        this.horsePow = horsePow;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHorsePow() {
        return horsePow;
    }

    public int getMilage() {
        return milage;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePow=" + horsePow +
                ", milage=" + milage +
                ", weight=" + weight +
                '}';
    }

}
