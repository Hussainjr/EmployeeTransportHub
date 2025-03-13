package com.crm.crm.p4;

public class Printer {
    public void print(String message){
        System.out.println("printing message: "+message);
    }

    public void print(int x){
        System.out.println("printing int: "+x);
    }

    public void print(double number){
        System.out.println("printing double: "+number);
    }

    public void print(String message, int number){
        System.out.println("printing message and number: "+message+" ,"+number);
    }

    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.print(10);
        printer.print("hello world");
        printer.print(3.0);
        printer.print("hi",10);

    }

}
