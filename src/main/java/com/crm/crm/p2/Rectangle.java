package com.crm.crm.p2;

public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }

    @Override
    public double calculateArea(){
        return length * width;
    }

    public static void main(String[] args) {
        Shape myShape = new Shape();
        Circle myCircle = new Circle(5);
        Rectangle myRectangle = new Rectangle(4.0,6.0);

        System.out.println("Area of generic shape: "+ myShape.calculateArea());
        System.out.println("Area of circle: "+ myCircle.calculateArea());
        System.out.println("Area of Rectangle: "+ myRectangle.calculateArea());


    }



}
