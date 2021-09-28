import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Palmer Ilnisky
 */

public class App {
    public static int calulateHeartRate(int intensity, int restingHR, int age){
        double heartRate = (((220 - age) - restingHR) * (intensity / 100.0)) + restingHR;

        return (int) heartRate;

    }

    public static  void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Resting Pulse: ");
        int restingHR = inputScanner.nextInt();
        System.out.print("Age: ");
        int age = inputScanner.nextInt();

        System.out.println("Intensity | Rate");
        System.out.println("_________ |_______");
        for(int intensity = 55; intensity <=95; intensity += 5){
            int heartRate = calulateHeartRate(intensity, restingHR, age);
            System.out.println(intensity +"%\t  | " +heartRate+ "bpm");

        }

        inputScanner.close();
        
    }
}