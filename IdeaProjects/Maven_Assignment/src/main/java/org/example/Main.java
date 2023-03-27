package org.example;


public class Main {
    public String returnSomething() {
        return "Hello World";
    }
    public static void main(String[] args) {

        Main m1=new Main();
        System.out.println(m1.returnSomething());
    }
}