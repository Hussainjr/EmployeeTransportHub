package com.crm.crm.p1;

public class Bike extends Vehicle{

    @Override
    public void start(){
        System.out.println("Bike is starting");
    }

    public static void main(String[] args){
        Vehicle myVehicle = new Vehicle();
        Car myCar = new Car();
        Bike myBike = new Bike();

        myVehicle.start();  myCar.start();  myBike.start();

    }


}
