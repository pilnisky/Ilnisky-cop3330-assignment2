import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Palmer Ilnisky
 */

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        String input = "";
        boolean is_valid = false;
        while (!is_valid){
            System.out.println("What is the rate of return?");
            input = scan.nextLine();
            is_valid= valid(input);
            if (is_valid){
                break;
            }
        }
        int rate = Integer.parseInt(input);
        System.out.println("It will take " + (72/rate) + " years to double your initial investment");
    }
    public static boolean valid (String input){
        try {
            double d = Double.parseDouble(input);
        } catch (NumberFormatException nfe) {
            return false;
        }
        double num = Double.parseDouble(input);
        if (num == 0){
            return false;
        }
        return true;
    }
}