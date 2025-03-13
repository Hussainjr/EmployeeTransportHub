package com.crm.crm.p3;

public class Employee {

    private String name;
    public Employee(String name){
        this.name=name;
    }

    public double calculateSalary(){
        System.out.println("Calculating salary for a generic employee");
        return 0.0;
    }
    public String getName(){    //getter
        return name;
    }

}
