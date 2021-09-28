/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Palmer Ilnisky
 */

import java.util.Arrays;
import java.util.Scanner;


public class AnagramCheck {

    public static Boolean isAnagram(String str1, String str2) {

        Boolean anagram;
   
        int str1Length = str1.length();
        int str2Length = str2.length();

        if (str1Length == str2Length) {
            char str1Arr[] = str1.toCharArray();
            char str2Arr[] = str2.toCharArray();

 
            Arrays.sort(str1Arr);
            Arrays.sort(str2Arr);

            if (Arrays.equals(str1Arr, str2Arr)) {
                anagram = true;
            } else {
                anagram = false;
            }

        } else {
            anagram = false;
        }

        return anagram;
    }

    public static void main(String[] args) {

	System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.println("Enter the first string: ");
        Scanner strScnr = new Scanner(System.in);
        String str1 = strScnr.nextLine();
        System.out.println("Enter the second string:");
        String str2 = strScnr.nextLine();

 	if (str1.equals("") || str2.equals("")) {
            while (str1.equals("") || str2.equals("")) {
                System.out.println("Please enter a string with a length greater than 0");
                System.out.println("Enter the first string");
                str1 = strScnr.nextLine();
                System.out.println("Enter the second string");
                str2 = strScnr.nextLine();
            }

        }

        String aStr1 = str1;
        String bStr2 = str2;

        str1 = str1.replaceAll(" ", "");
        str1 = str1.toLowerCase();
        str2 = str2.replaceAll(" ", "");
        str2 = str2.toLowerCase();

    
        if (isAnagram(str1, str2)) {
            System.out.println(aStr1 + " and " + bStr2 + " are anagrams.");
        } else
            System.out.println(aStr1 + " and " + bStr2 + " are not anagrams.");

    }
}