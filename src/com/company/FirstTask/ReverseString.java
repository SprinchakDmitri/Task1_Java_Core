package com.company.FirstTask;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        System.out.println(getReverseMessage(inputString));
    }


    public static String getReverseMessage(String input) {
        StringBuilder inputString = new StringBuilder(input);
        StringBuilder outputString = new StringBuilder();

        for(int i = inputString.length() - 1; i >= 0 ; i--) {
            outputString.append(inputString.charAt(i));
        }
        return outputString.toString();
    }
}
