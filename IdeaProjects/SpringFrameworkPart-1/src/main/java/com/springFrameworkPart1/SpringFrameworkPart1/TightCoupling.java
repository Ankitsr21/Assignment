package com.springFrameworkPart1.SpringFrameworkPart1;

class Area{
    int area;
    Area(int length, int breadth){
        this.area = length*breadth;
    }
}
public class TightCoupling {
    public static void main(String[] args) {
        Area obj = new Area(10,12);
        System.out.println("Area of Rectangle: "+obj.area);
    }
}
