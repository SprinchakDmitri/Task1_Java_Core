package com.company.OOP_Task;

public class Square extends GraphicObject{

   int sideLength;

   Square(int sideLength){
       this.sideLength = sideLength;
   }
   public void area(){
       System.out.println("Area of the square is: " + (sideLength * sideLength));
   }
   public void perimeter(){
       System.out.println("Perimeter of the square is: " + (sideLength * 4));
   }
}
