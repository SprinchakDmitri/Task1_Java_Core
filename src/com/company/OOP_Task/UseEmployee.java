package com.company.OOP_Task;

public class UseEmployee {
    public static void main(String[] args) {

        Employee employee = new Employee(8);
        Manager manager  = new Manager(8);

        System.out.println(employee.getTariffPerHour());
        System.out.println(employee.getSalary());

        System.out.println(manager.getTariffPerHour());
        System.out.println(manager.getSalary());
    }
}
