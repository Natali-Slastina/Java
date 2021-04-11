//package com.max.idea;

import java.util.Scanner;

public class Equat {
    public static void main(String[] args) {
        System.out.println("Enter your equation");
        Scanner scan = new Scanner(System.in);
        String equat = scan.nextLine();
        String[] a = equat.split("");
        if (equat.equals(String.format("%s" + "+" + "%s" + "=x", a[0], a[2]))) {
            System.out.println("Your equation: " + a[0] + " + " + a[2] + " = x");
            int b = Integer.parseInt(a[0]);
            int c = Integer.parseInt(a[2]);
            int x = b + c;
            System.out.println("x = " + x);
        } else if (equat.equals(String.format("%s" + "-" + "%s" + "=x", a[0], a[2]))) {
            System.out.println("Your equation: " + a[0] + " - " + a[2] + " = x");
            int b = Integer.parseInt(a[0]);
            int c = Integer.parseInt(a[2]);
            int x = b - c;
            System.out.println("x = " + x);
        } else if (equat.equals(String.format("x" + "-" + "%s" + "=" + "%s", a[2], a[4]))) {
            System.out.println("Your equation: " + "x" + " - " + a[2] + " = " + a[4]);
            int b = Integer.parseInt(a[2]);
            int c = Integer.parseInt(a[4]);
            int x = b + c;
            System.out.println("x = " + x);
        } else if (equat.equals(String.format("x" + "+" + "%s" + "=" + "%s", a[2], a[4]))) {
            System.out.println("Your equation: " + "x" + " + " + a[2] + " = " + a[4]);
            int b = Integer.parseInt(a[2]);
            int c = Integer.parseInt(a[4]);
            int x = c - b;
            System.out.println("x = " + x);
        } else if (equat.equals(String.format("%s" + "+" + "x" + "=" + "%s", a[0], a[4]))) {
            System.out.println("Your equation: " + a[0] + " + " + "x" + " = " + a[4]);
            int b = Integer.parseInt(a[0]);
            int c = Integer.parseInt(a[4]);
            int x = c - b;
            System.out.println("x = " + x);
        } else if (equat.equals(String.format("%s" + "-" + "x" + "=" + "%s", a[0], a[4]))) {
            System.out.println("Your equation: " + a[0] + " - " + "x" + " = " + a[4]);
            int b = Integer.parseInt(a[0]);
            int c = Integer.parseInt(a[4]);
            int x = b - c;
            System.out.println("x = " + x);
        } else
            System.out.println("invalid value. it's not correct equation");
    }
}
