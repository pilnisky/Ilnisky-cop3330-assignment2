import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Palmer Ilnisky
 */

public class App 
{
    public static void main( String[] args )
    {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        String input;
        String[] response = {"Yes", "No", "Maybe", "Ask again later"};
        int randomnum = rand.nextInt((4) + 1) ;

        System.out.println("What is your question?");
        input = scan.next();
        System.out.println(response[randomnum]);
    }
}