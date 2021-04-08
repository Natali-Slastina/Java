//package com.max.idea;

import java.util.Scanner;

public class Taskelev {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Ввести первое  число с клавиатуры и записать его в строковую переменную.
        System.out.println("Enter your first value");
        String str = scan.nextLine();
        //Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
        System.out.println("Enter your second value");
        Integer num1 = scan.nextInt();
        //Сравнить 2 числа и вывести большее на экран .
        Integer num2 = Integer.valueOf(str);
        int result = num1.compareTo(num2);
        if (result == 0)
            System.out.println("Your numbers is equals");
        else if (result == 1)
            System.out.println("Max is " + num1);
        else
            System.out.println("Max is " + num2);
        //Выведите также меньшее число на экран, предварительно переконвертировать его в тип double
        double num3 = num2;
        double result2 = Math.min(num1, num3);
        System.out.println("Min is " + result2);
    }
}
