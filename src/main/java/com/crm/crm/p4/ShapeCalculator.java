package com.crm.crm.p4;

public class ShapeCalculator {
    public double calculateArea(double side){
        return side*side;
    }

    public double calculateArea(double radius, String shape){
        if(shape.equalsIgnoreCase("circle")){
            return Math.PI* radius * radius;
        }
        return 0.0;
    }
    public double calculateArea(double length, double width){
        return length * width;
    }

    public static void main(String[] args){
        ShapeCalculator calculator = new ShapeCalculator();
        System.out.println("area of square: "+calculator.calculateArea(5));
        System.out.println("area of rectangle: "+calculator.calculateArea(10,5));
        System.out.println("area of circle: "+calculator.calculateArea(5,"circle"));
    }

}
