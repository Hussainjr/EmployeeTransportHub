package com.crm.crm.p3;

public class Developer extends Employee{
    private double baseSalary;
    private double overTimeHours;
    private double overTimeRate;

    //Constructor
    public Developer(String name, double baseSalary ,double overTimeHours, double overTimeRate) {
        super(name);
        this.baseSalary=baseSalary;
        this.overTimeHours=overTimeHours;
        this.overTimeRate=overTimeRate;
    }

    @Override
    public double calculateSalary(){
        return baseSalary+(overTimeRate*overTimeHours);
    }

    public static void main(String[] args) {
        Employee genericEmployee = new Employee("john");
        Employee manager = new Manager("alice",500,2000);
        Employee developer = new Developer("bob",4000,10,50.0);

        System.out.println(genericEmployee.getName() + " salary "+ genericEmployee.calculateSalary());
        System.out.println(manager.getName()+" salary "+manager.calculateSalary());
        System.out.println(developer.getName()+ " salary "+developer.calculateSalary());

    }

}
