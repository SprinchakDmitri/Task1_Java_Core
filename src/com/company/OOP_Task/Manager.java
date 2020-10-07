package com.company.OOP_Task;

public class Manager extends Employee{

    public Manager() {
    }

    public Manager(int hours) {
        super(hours);
    }

    @Override
    double getSalary() {
        return super.getSalary() + super.getSalary() / 2;
    }
}
