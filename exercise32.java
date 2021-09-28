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
        int diff = 0, check,guesses = 0, randomNum;
        String guess,yes = "y", input, play;
        Random rand = new Random();
        boolean valid_dif= false;
        boolean game = true;
        boolean round = true;
        Scanner scan = new Scanner(System.in);

        while(game) {

            while (!valid_dif) {
                System.out.println("Enter the difficulty level (1,2, or 3)");
                input = scan.nextLine();

                if (is_numeric(input)) {
                    diff = Integer.parseInt(input);
                    valid_dif = true;
                } else {
                    System.out.println("Not a number, guess again");
                }
            }
            switch (diff) {
                case 1:
                    randomNum = rand.nextInt((10 - 1) + 1) + 1;
                    break;
                case 2:
                    randomNum = rand.nextInt((100 - 1) + 1) + 1;
                    break;
                case 3:
                    randomNum = rand.nextInt((1000 - 1) + 1) + 1;
                    break;

                default:
                    randomNum = 0;
            }

            round = true;
            System.out.println("I have my number what is your guess");

            while (round) {
                guess = scan.nextLine();
                guesses = guesses + 1;
                if (is_numeric(guess)) {
                    check = Integer.parseInt(guess);
                    System.out.println(guess_check(check, randomNum, guesses));
                    if (check == randomNum) {
                        System.out.println("Do you wish to play again (Y/N)");
                        play = scan.nextLine();
                        if (play.equals(yes)) {
                            guesses = 0;
                            round = false;
                            valid_dif = false;
                        } else {
                            game = false;
                            break;
                        }
                    }
                } else {
                    System.out.println("That is not a number. Guess again");
                    guesses = guesses + 1;
                }
                if (guesses == 10) {
                    System.out.println("Do you wish to play again (Y/N)");
                    play = scan.nextLine();
                    if (play.equals(yes)) {
                        guesses = 0;
                        round = false;
                        valid_dif = false;
                    } else {
                        game = false;
                        break;
                    }
                }
            }
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
    public static String guess_check (int check, int rand, int guesses){
        String output;
        if (check > rand){
            output = "Too high. Guess again.";
        }
        else if (rand > check){
            output = "Too low. Guess again.";
        }
        else {
            output = ("You got it in " + guesses + " guesses!");
        }
        return output;
    }

}