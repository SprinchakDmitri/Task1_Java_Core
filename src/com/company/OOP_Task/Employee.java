package com.company.OOP_Task;

public class Employee {
    private double tariffPerHour = 5.5;
    public int hours = 0;

    double getSalary(){
        return tariffPerHour * hours;
    }

    public double getTariffPerHour() {
        return tariffPerHour;
    }

    Employee(){
    }

    Employee(int hours){
        this.hours = hours;
    }
}
