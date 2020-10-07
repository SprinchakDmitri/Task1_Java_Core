package com.company.OOP_Task;

public class UseStudent {
    public static void main(String [] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.setData("John Brown", 24);
        student2.setData("Melisa Anderson",21);

        System.out.println("The average age is " + (((double)student1.getAge() +
                 student2.getAge())/2) +" ages");
    }
}
