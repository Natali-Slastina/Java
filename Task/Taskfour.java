package com.max.idea;
import java.util.Scanner;

public class Taskfour {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter your x, y, z");
        double x, y, z;
        x = num.nextDouble();
        y = num.nextDouble();
        z = num.nextDouble();
        double dim = (x + y + z) / 3;
        System.out.println("Среднее арифмитическое "+dim);
        double even = Math.floor((dim/2));
        System.out.println("1/2 и округление в меньшую сторону  "+even);
        if(even>3)
            System.out.println("Программа выполнена корректно");

    }
}
