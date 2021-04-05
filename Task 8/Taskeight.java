//package com.max.idea;

import java.util.Scanner;

public class Taskeight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter  any integer number > 0");
        int n = scan.nextInt();
        int sum = 0;
        if (n < 0 || n == 0)
            System.out.println("You entered an invalid number");
        else {
            for (int i = 1; i < n; i++) {
                if (i % 2 != 0)
                    sum += i;
            }
            System.out.print(sum);
        }
    }
}
