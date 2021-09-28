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
        Scanner scan = new Scanner (System.in);
        String remove;
        String[] names = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        String new_names [] = new String[names.length-1];
        System.out.println("There are 5 employees");

        for (int i =0; i < names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("Enter an employee name to remove");
        remove = scan.nextLine();

        for (int i=0; i< names.length; i++){
            String test = names[i];
            if (remove.equals(test)){
                System.arraycopy(names, 0, new_names, 0, i);
                System.arraycopy(names,  i+ 1, new_names, i, names.length - i - 1);
            }
        }

        System.out.println("There are " + new_names.length + " employees");
        for (int i =0; i< new_names.length; i++){
            System.out.println(new_names[i]);
        }
    }
}