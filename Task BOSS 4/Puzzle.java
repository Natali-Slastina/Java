//package com.max.idea;

import java.util.Scanner;

public class Puzzle {
    public static void main(String[] args) {
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        System.out.println("If you need the hint, enter \"Подсказка\"");
        String correct = "Заархивированный вирус";
        String help = "Подсказка";
        String hint = "It's not onion! Enter your answer: ";
        String nohint = ("You don't have the hint. Enter your answer: ");
        String win = "Win!!";
        String notry = "No.. Try again! you have attempts: ";
        String finish = "No.. Mb on another time";
        Scanner scan = new Scanner(System.in);
        int attemps = 3;
        for (int attemp = 1; attemp <= attemps; attemp++) {
            String str = scan.nextLine();
            if (str.equals(help)) {
                if (attemp == 1) {
                    System.out.println(hint);
                    String str1 = scan.nextLine();
                    if (str1.equals(correct)) {
                        System.out.println(win);
                        System.exit(0);
                    } else {
                        System.out.println(finish);
                        System.exit(0);
                    }
                } else
                    System.out.println(nohint);
                attemps += 1;
            } else if (str.equals(correct)) {
                System.out.println(win);
                System.exit(0);
            } else if (attemp == attemps)
                System.out.println(finish);
            else
                System.out.println(notry + (attemps - attemp));
        }
    }
}
