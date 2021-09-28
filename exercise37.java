import java.util.Arrays;
import java.util.Random;
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
        int length,schar, nums,random_num;
        int schar_count = 0, digit_count= 0, letter_count = 0;
        String abc = "abcdefghijklmnopqrstuvwxzy";
        String digits = "0123456789";
        String special = "!@#$%&*()?";
        String password = "";

        System.out.println( "What is the minimum length?" );
        length = scan.nextInt();;
        System.out.println("How many special characters");
        schar = scan.nextInt();
        System.out.println("How many numbers?");
        nums = scan.nextInt();

        while (password.length()<length || schar_count < schar || digit_count < nums || letter_count <(schar_count + digit_count) ){
            random_num = getrand(2);

            if (random_num==0 && schar_count < schar){
                password = add_char(password, special);
                schar_count++;
            }
            if (random_num == 1 && digit_count < nums){
                password = add_char(password, digits);
                digit_count++;
            }
            else{
                password = add_char(password, abc);
                letter_count++;
            }
        }

        System.out.println("Your password is " + password);

    }
    public static int getrand (int length) {
        Random rand = new Random();
        return rand.nextInt((length)) ;
    }
    public static String add_char (String password, String chars) {
        return password + chars.charAt(getrand(chars.length()));
    }
}