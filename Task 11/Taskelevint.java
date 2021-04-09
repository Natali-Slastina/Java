//package com.max.idea;

import java.util.Scanner;

public class Taskelevint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Ввести первое  число с клавиатуры и записать его в строковую переменную.
        System.out.println("Enter your first value");
        String str = scan.nextLine();
        double num1 = Double.valueOf(str);
        //Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
        System.out.println("Enter your second value");
        Integer num2 = (int) scan.nextDouble();
        //Сравнить 2 числа и вывести большее на экран
        System.out.println("Your second value is updated: " + num2);
        //Сравнить 2 числа и вывести большее на экран
        Integer num4 =(int) num1;
        System.out.println("Your first value is updated: "+num4);
        int result  = num4.compareTo(num2);
        if (result == 0)
            System.out.println("Your numbers is equals");
        else if (result == 1)
            System.out.println("Max is " + num4);
        else
            System.out.println("Max is " + num2);
        //Выведите также меньшее число на экран, предварительно переконвертировать его в тип double
        double num3 = num2;
        double num5 = num4;
        double result2 = Math.min(num5, num3);
        if (num5 != num3)
            System.out.println("Min is " + result2);
    }
}
