package com.company.OOP_Task;

public class Circle extends GraphicObject{

    int radius;

    Circle(int radius){
        this.radius = radius;
    }

    public void area(){
        System.out.println("Area of the circle is: " + (Math.PI *(radius * radius)));
    }
    public void perimeter(){
        System.out.println("Perimeter of the circle is: " + (2 * Math.PI * radius));
    }


}
