package com.max.idea;

import java.util.Scanner;

public class Tasknine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Пользователь вводит размер массива
        System.out.println("Enter the length of your array");
        int size = scan.nextInt();
        double[] myArray = new double[size];
        if (size != 0) {
            System.out.println("Enter items of your array"); //данные с клавиатуры в массив типа double.
            for (int i = 0; i < size; i++) {
                myArray[i] = scan.nextDouble();
            }
            System.out.println("Your array:");
            for (int i = 0; i < size; i++) {
                System.out.print(myArray[i] + " ");
            }
            //Посчитайте среднее арифметическое элементов массива
            double sum = 0;
            for (int i = 0; i < size; i++) {
                sum += myArray[i];
            }
            double aver = sum / size;
            System.out.println("\nAverage of your array " + aver);
            //Произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
            for (int i = 0; i < size; i++)
                myArray[i] *= aver;
            System.out.println("New array: ");
            for (int i = 0; i < size; i++)
                System.out.print(myArray[i] + " ");
        } else
            System.out.println("Your array []. Enter length not equal to zero");

    }
}
