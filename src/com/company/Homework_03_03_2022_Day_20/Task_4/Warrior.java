package com.company.Homework_03_03_2022_Day_20.Task_4;

public abstract class Warrior {
    private String name;
    private String type;
    private String power;
    private String health;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getPower() {
        return power;
    }

    public String getHealth() {
        return health;
    }

    public abstract void hit();

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", power='" + power + '\'' +
                ", health='" + health + '\'' +
                '}';
    }
}
