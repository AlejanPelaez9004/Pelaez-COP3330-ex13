/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package Pelaez.Alejandro;
import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the principal amount? ");
        float p = input.nextFloat();
        System.out.print("What is the rate of interest? ");
        float r = input.nextFloat();
        System.out.print("What is the number of years? ");
        int t = input.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        int n = input.nextInt();

        double a =  (Math.round(p*Math.pow((1+(r/(n*100))), (n*t))*100.0)/100.0);
        System.out.printf("$%.2f invested at %.1f%% for %d years compounded %d times per year is $%.2f", p, r, t, n, a);
        System.out.print("\n");
    }
}
