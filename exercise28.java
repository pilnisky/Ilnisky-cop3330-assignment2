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
        int count = 0;
        for (int i=0;i<5;i++){
            System.out.println("Enter a number:");
            count = count + scan.nextInt();
    }
        System.out.println("The total is " + count);
    }
}