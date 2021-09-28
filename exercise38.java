import java.net.Inet4Address;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Palmer Ilnisky
 */

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        List<Integer> nums = new ArrayList<Integer>();
        System.out.println( "Enter a list of numbers separated by spaces" );
        String input = scan.nextLine();
        String[] x = input.split(" ");
        for (String y : x) {
            int tempInt = Integer.parseInt(y);
            nums.add(tempInt);
        }

        print_List(evens(nums));

    }

    public static List<Integer> evens (List<Integer> nums) {
        for (int i =0; i< nums.size(); i++){
            if (nums.get(i)%2 != 0) {
                nums.remove(i);
            }
        }

        return nums;
    }

    public static void print_List(List<Integer> nums) {
        System.out.println("The even numbers are ");
        for(int i=0;i<nums.size();i++){
            System.out.print(nums.get(i) + " ");
        }
    }
}