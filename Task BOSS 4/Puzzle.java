//package com.max.idea;

import java.util.Scanner;

public class Puzzle {
    public static void main(String[] args) {
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        System.out.println("If you need the hint, enter \"Подсказка\"");
        String correct = "Заархивированный вирус";
        String hint = "Подсказка";
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        //scan.nextLine();
        if (str1.equals(hint)) {
            System.out.println("It's not onion! Enter you answer: ");
            String attem1 = scan.nextLine();
            if (attem1.equals(correct)) {
                System.out.println("Win!!");
                System.exit(0);
            } else {
                System.out.println("No.. Mb on another time");
                System.exit(0);
            }
        } else {
            String attem1 = str1;
            if (attem1.equals(correct)) {
                System.out.println("Win!!");
                System.exit(0);
            } else {
                System.out.println("No.. Try again! 2");
                String attem2 = scan.nextLine();
                if (attem2.equals(hint)) {
                    System.out.println("You don't have the hint. Enter your answer");
                    String attem21 = scan.nextLine();
                    if (attem21.equals(correct)) {
                        System.out.println("Win!!");
                        System.exit(0);
                    } else {
                        System.out.println("No.. Try again! 3");
                        String attem3 = scan.nextLine();
                        if (attem3.equals(hint))
                            System.out.println("You don't have the hint. Enter your answer");
                        String attem31 = scan.nextLine();
                        if (attem31.equals(correct)) {
                            System.out.println("Win!!");
                            System.exit(0);
                        } else
                            System.out.println("No.. Mb on another time");
                    }
                } else if (attem2.equals(correct)) {
                    System.out.println("Win!!");
                    System.exit(0);
                } else {
                    System.out.println("No.. Try again! 3");
                    String attem4 = scan.nextLine();
                    if (attem4.equals(hint)) {
                        System.out.println("You don't have the hint. Enter your answer");
                        String attem41 = scan.nextLine();
                        if (attem41.equals(correct)) {
                            System.out.println("Win!!");
                            System.exit(0);
                        } else
                            System.out.println("No.. Mb on another time");
                    } else if (attem4.equals(correct)) {
                        System.out.println("Win!!");
                        System.exit(0);
                    } else
                        System.out.println("No.. Mb on another time");
                }
            }
        }
    }
}
