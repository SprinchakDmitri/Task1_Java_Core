package com.company;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number;
        while(true){
            System.out.println("Enter a number between 0 and 1000 \n" +
                    "to count summ of all digits");
            number = in.nextInt();
            if (number > 0 && number < 1000) break;
            System.out.println("Bad number. Try once again");
        }
        System.out.println(getSumOfDigits(number));

    }

    public static int getSumOfDigits(int number) {
        int sumOfDigits = 0;

            for (int i = number; i > 0; i /= 10) {
                sumOfDigits += i % 10;
            }

        return sumOfDigits;
    }

}
