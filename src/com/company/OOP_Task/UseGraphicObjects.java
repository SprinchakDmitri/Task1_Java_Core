package com.company.OOP_Task;

public class UseGraphicObjects {


    public static void main(String[] args) {
        GraphicObject circleObject = new Circle(7);
        GraphicObject squareObject = new Square(7);

        circleObject.area();
        squareObject.area();
    }
}
