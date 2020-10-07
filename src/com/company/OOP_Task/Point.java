package com.company.OOP_Task;

public class Point {
    private int x;
    private int y;
    private int z;

    Point(){
        x = 0;
        y = 0;
        z = 0;
    }

    Point(int x, int y){
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    Point(int x, int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
