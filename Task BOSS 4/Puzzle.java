//package com.max.idea;

import java.util.Scanner;

public class Puzzle {
    public static void main(String[] args) {
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        String correct = "Заархивированный вирус";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1 - if you need the hint or 2 - if you don't");
        int a = scan.nextInt();
        scan.nextLine();
        if (a == 1) {
            System.out.println("It's not onion! Enter you answer: ");
            String attem1 = scan.nextLine();
            if (attem1.equals(correct))
                System.out.println("Win!!");
            else {
                System.out.println("No.. Mb on another time");
                System.exit(0);
            }
        } else if (a == 2) {
            System.out.println("Enter you answer");
            String attem1 = scan.nextLine();
            if (attem1.equals(correct)) {
                System.out.println("Win!!");
                System.exit(0);
            } else
                System.out.println("No.. Try again!");
            String attem2 = scan.nextLine();
            if (attem2.equals(correct)) {
                System.out.println("Win!!");
                System.exit(0);
            } else
                System.out.println("No.. Try again!");
            String attem3 = scan.nextLine();
            if (attem3.equals(correct))
                System.out.println("Win!!");
            else
                System.out.println("No.. Mb on another time");

        } else
            System.out.println("You entered invalid value");
    }
}
