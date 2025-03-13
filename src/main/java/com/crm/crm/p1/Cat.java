package com.crm.crm.p1;

public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("cat is meowing");
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        myAnimal.makeSound();
        myDog.makeSound();
        myCat.makeSound();

    }

}
