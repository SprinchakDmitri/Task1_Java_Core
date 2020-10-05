package com.company;

import java.util.Scanner;

public class CharCount {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String string1 = in.nextLine();

        System.out.println(countTypesOfChars(string1));

    }

    public static String countTypesOfChars(String input){
        int numbers = 0;
        int letters = 0;
        int others  = 0;
        int spaces  = 0;

        for (int i = 0; i < input.length(); i++){
            if (Character.isDigit(input.charAt(i)))   {   numbers++; continue;}
            if (Character.isLetter(input.charAt(i)))   {  letters++; continue;}
            if (Character.isWhitespace(input.charAt(i)))  spaces++;
            else others++;
            }

        return "Numbers:" + numbers + "\n"
                + "Letters:" + letters + "\n"
                + "Spaces:" + spaces + "\n"
                + "Others:" + others;
    }
}
