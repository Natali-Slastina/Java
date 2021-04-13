//package com.max.idea;

import java.util.Scanner;

public class Ratecon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your cash in RUB");
        double cash = scan.nextDouble();
        System.out.println("Enter dollar rate");
        double rate = scan.nextDouble();
        if (cash == 0 || rate == 0)
            System.out.println("You enter value = 0");
        else if (cash < 0 || rate < 0)
            System.out.println("You enter value < 0");
        else {
            double money = cash * rate;
            System.out.printf("Your money is " + "%.2f", money);
        }
    }
}
