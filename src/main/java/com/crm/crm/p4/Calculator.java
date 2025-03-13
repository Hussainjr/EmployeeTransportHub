package com.crm.crm.p4;

public class Calculator {

    public int add(int a, int b){
        return a+b;
    }

    public int add (int a , int b, int c){
        return a+b+c;
    }

    public double add(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();

        System.out.println(cal.add(10,10)); //20
        System.out.println(cal.add(10.2,20.3)); //30.5
        System.out.println(cal.add(10,10,10));  //30
    }

}
