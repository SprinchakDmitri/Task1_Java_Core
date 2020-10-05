package com.company;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(getSumOfDigits(number));

    }

    public static int getSumOfDigits(int number) {
        int sumOfDigits = 0;
        if (number > 0 && number < 1000) {
            for (int i = number; i > 0; i /= 10) {
                sumOfDigits += i % 10;
            }

        }
        return sumOfDigits;
    }

}
