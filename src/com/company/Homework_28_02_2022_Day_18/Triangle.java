package com.company.Homework_28_02_2022_Day_18;

public class Triangle {
    private byte sideA;
    private byte sideB;
    private byte sideC;

    public Triangle() {

    }

    public Triangle(byte sideA, byte sideB, byte sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public void setSideA(byte sideA) {
        this.sideA = sideA;

    }

    public byte getSideA() {
        return sideA;
    }

    public void setSideB(byte sideB) {
        this.sideB = sideB;
    }

    public void setSideC(byte sideC) {
        this.sideC = sideC;
    }

    public byte getSideB() {
        return sideB;
    }

    public byte getSideC() {
        return sideC;
    }

    private boolean isTriangleValid(byte sideA,byte sideB, byte sideC) {
        if (sideA < (sideB+sideC) && sideB<(sideA+sideC) && sideC<(sideA+sideB) )
            return true;
        return false;
    }

    public boolean check(Triangle triangle) {

            return  isTriangleValid(triangle.sideA, triangle.sideB, triangle.sideC);

    }
    private boolean isRight(byte sideA, byte sideB, byte sideC){
        if (sideB == sideA && sideA==sideC) {
            return true;
        }
        else return false;
    }
    public void areaOrPerimetr(byte sideA, byte sideB, byte sideC){
        if(isRight(sideA,sideB,sideC)){
            System.out.println("Area :"+ ((Math.pow(sideA,2)* Math.sqrt(3)/4)));
        }
       else
           System.out.println("Perimetr : "+(sideA*3));
    }
}
