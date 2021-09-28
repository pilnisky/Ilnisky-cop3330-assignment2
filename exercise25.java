import java.util.*;
public class Assignment_2_passwordValidator {

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Palmer Ilnisky
 */

    public static void passwordValidator(String input)
    {
        
        int n = input.length();
        boolean hasLower = false, hasUpper = false,
                hasDigit = false, specialChar = false;
        Set<Character> set = new HashSet<Character>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));
        for (char i : input.toCharArray())
        {
            if (Character.isLowerCase(i))
                hasLower = true;
            if (Character.isUpperCase(i))
                hasUpper = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true;
        }

        if (hasDigit && hasLower || hasUpper && specialChar
                && (n >= 8))
            System.out.println("A very strong password");

        else if ((hasLower || hasUpper || specialChar)
                && (n >= 8))
            System.out.println("A strong password");

        else if(hasLower || hasUpper && (n < 8))
            System.out.print("A weak password");

        else
            System.out.print("A very weak password");

    }

    public static void main(String[] args)

    {
        String input;
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter password: ");
        input=sc.nextLine();
        passwordValidator(input);
    }


}