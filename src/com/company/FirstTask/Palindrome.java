package com.company.FirstTask;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        System.out.println(checkIfPalindrome(number));

    }
    public static boolean checkIfPalindrome(Integer number){
        number = Math.abs(number);
        StringBuilder stringBuilder1 = new StringBuilder(number.toString());
        StringBuilder stringBuilder2 = new StringBuilder(stringBuilder1);
        stringBuilder2.reverse();

     return stringBuilder1.compareTo(stringBuilder2) == 0;

    }
}
