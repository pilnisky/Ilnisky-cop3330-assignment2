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
        String first, last, zip, id;
        Scanner scan = new Scanner(System.in);

        System.out.println( "Enter the first name:" );
        first = scan.nextLine();

        System.out.println( "Enter the last name:" );
        last = scan.nextLine();

        System.out.println( "Enter the ZIP code:" );
        zip = scan.nextLine();

        System.out.println( "Enter the employee ID:" );
        id = scan.nextLine();

        System.out.println(validateInput(first,last,zip,id));

    }
    public static boolean name_length(String name){
        if (name.length()<2) {
            return false;
        }
        else {
            return true;
        }
    }
    public static boolean zip (String zip){
        if (zip.length()<5){
            return false;
        }
        try {
            double d = Double.parseDouble(zip);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    public static boolean id (String id){
        if (id.matches("[^a-zA-Z]*[A-Za-z]{2}-\\d{4}")) {
            return true;
        }
        else {
            return false;
        }

    }
    public static String validateInput (String first, String last, String zip, String id){
        String first_error = "The first name must be at least two characters long\n ";
        String last_error = "The last name must be at least two characters long\n ";
        String zip_error = "The zipcode must be a 5 digit number\n ";
        String id_error = "The employee ID must be in the format AA-1234\n";
        String response = "";

        if(!name_length(first)){
            response = response + first_error;
        }
        if(!name_length(last)){
            response = response + last_error;
        }
        if (!zip(zip)){
            response = response + zip_error;
        }
        if(!id(id)){
            response = response + id_error;
        }

        if(response.length()<1){
            response = "There were no errors found";
        }
        return response;
    }
}