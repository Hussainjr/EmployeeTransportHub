package com.crm.crm.p2;

public class Cat extends Dog {

    public void noise(){
        System.out.println("mew mew...");
    }
    public static void main(String[] args) {

        Dog d=new Dog();
        d.eat(); //eating...
        d.noise(); //bow bow
        System.out.println("    ");
        Cat c=new Cat();
        c.eat(); //eating...
        c.noise(); //mew mew...

    }
}
