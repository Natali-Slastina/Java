//package com.max.idea;

import java.util.Scanner;

public class Taskelev {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Ввести первое  число с клавиатуры и записать его в строковую переменную.
        System.out.println("Enter your first value");
        String str = scan.nextLine();
        Double num1 = Double.valueOf(str);
        //Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int. ?возможность вводить дабл, но сохранять как инт?
        System.out.println("Enter your second value");
        Integer num2 = scan.nextInt();
        //Сравнить 2 числа и вывести большее на экран
        double num3 = num2;
        int result = Double.compare(num3,num1);
        if (result == 0)
            System.out.println("Your numbers is equals");
        else if (result == 1)
            System.out.println("Max is " + num3);
        else
            System.out.println("Max is " + num1);
        //Выведите также меньшее число на экран, предварительно переконвертировать его в тип double ?оба числа уже дабл?
        double result2 = Math.min(num1, num3);
        if (num1 != num3)
            System.out.println("Min is " + result2);
    }
}
