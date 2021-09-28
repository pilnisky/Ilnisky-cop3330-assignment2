import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
import  java.util.ArrayList;
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
        List<Double> nums = new ArrayList<Double>();
        String input;
        boolean flag = true;
        int index = 0;
        while (flag){
            System.out.println("Enter a number");
            input = scan.nextLine();
            if (is_numeric(input)){
                nums.add(index, Double.parseDouble(input));
            }
            else if (is_done(input)){
                flag = false;
            }
            else {
                System.out.println("That is not a valid input");
            }
        }

        System.out.println("The average is " + mean(nums));
        System.out.println("The minimum is " + min(nums));
        System.out.println("The max is " + max(nums));
        System.out.println("The standard deviation is " + std(nums));


    }
    public static boolean is_done(String input){
        String done = "done";
        if (input.equals(done)){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean is_numeric(String x){
        try {
            double d = Double.parseDouble(x);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    public static double max(List <Double> nums){
        double max = Double.POSITIVE_INFINITY * -1;
        for (int i=0;i<nums.size();i++){
            if (max < nums.get(i)){
                max = nums.get(i);
            }
        }
        return max;
    }
    public static double min(List <Double> nums){
        double min = Double.POSITIVE_INFINITY;
        for (int i=0;i<nums.size();i++){
            if (min > nums.get(i)){
                min = nums.get(i);
            }
        }
        return min;
    }
    public static double mean(List <Double> nums){
        double sum = 0;
        for (int i=0;i<nums.size();i++){
            sum = sum + nums.get(i);
            }
        return sum/nums.size();
        }

    public static double std(List <Double> nums){
        double mean = mean(nums);
        double squares = 0;
        for (int i=0;i<nums.size();i++){
            squares = squares + Math.pow(nums.get(i)- mean, 2);
        }
        double output = Math.sqrt(squares/nums.size());
        output = Math.round(output * 100.00)/100.00;
        return output;
    }

}