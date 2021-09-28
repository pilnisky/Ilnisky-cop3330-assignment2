
import java.util.*;
import java.lang.Math;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Palmer Ilnisky
 */

public class apps {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double n, i, b, p, apr, var;
        System.out.print("What is the balance? ");
        String balance=in.nextLine();

        System.out.print("What is the APR on the card (as a percent)? ");
        String percent=in.nextLine();

        apr = Double.parseDouble(percent);
        apr = apr/100.0;

        double mapr = apr/12.0;

        b = Double.parseDouble(balance);
        System.out.print("What is the monthly payment you can make? ");
        String payment=in.nextLine();

        p = Double.parseDouble(payment);

        i = apr / 365.0;
        var = 1.0 - (1.0 + i);

        n = Math.ceil(-1.0 * (Math.log(1.0 - (b * mapr) / p) / Math.log(1.0 + mapr)));

        System.out.print("It will take you "+(int)n+" months to pay off this card.");
    }
}