//package com.max.idea;

import java.util.Scanner;

public class Taskfour {
    public static void main(String[] args) {
        //Ввести три числа с клавиатуры x, y, z
        Scanner num = new Scanner(System.in);
        System.out.println("Enter your x, y, z"); 
        double x, y, z;
        x = num.nextDouble();
        y = num.nextDouble();
        z = num.nextDouble();
        
        //Найти и вывести в консоль среднее арифметическое этих чисел
        double dim = (x + y + z) / 3;
        System.out.println("Среднее арифмитическое "+dim);
        
        //Разделить среднее арифметическое на 2 и округлить в меньшую сторону
        double even = Math.floor((dim/2));
        System.out.println("1/2 и округление в меньшую сторону  "+even);
        
        //Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
        if(even>3)
            System.out.println("Программа выполнена корректно");

    }
}
