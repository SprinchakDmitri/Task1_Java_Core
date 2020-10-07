package com.company.OOP_Task;

public class UsePoint {
    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point(12,2);
        Point point3 = new Point(6,2,5);

        System.out.println("First Point x: " + point1.getX() +
                "\n\t\t\ty: " + point1.getY() + "\n\t\t\tz: " + point2.getZ());

        System.out.println("Second Point x:" + point2.getX() +
                "\n\t\t\ty: " + point2.getY() + "\n\t\t\tz: " + point2.getZ());

        System.out.println("Third Point x:" + point3.getX() +
                "\n\t\t\ty: " + point3.getY() + "\n\t\t\tz: " + point3.getZ());

    }
}
