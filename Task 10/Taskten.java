//package com.max.idea;

import java.util.Scanner;
import java.util.Arrays;

public class Taskten {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Пользователь вводит размер матрицы
        System.out.println("Enter number of rows");
        int rows = scan.nextInt();
        System.out.println("Enter number of columns");
        int cols = scan.nextInt();
        double[][] myArray = new double[rows][cols];
        //Пользователь вводит данные матрицы
        if (rows != 0 && cols != 0) {

            System.out.println("Enter items of your array. First the first line, etc");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    myArray[i][j] = scan.nextDouble();
                }
            }
            System.out.println("Your array:");
            for (int i = 0; i < rows; i++) {
                System.out.println(Arrays.toString(myArray[i]));
            }
            //вывод первой строки матрицы на экран, где каждый элемент умножается на 3
            for (int j = 0; j < cols; j++) {
                myArray[0][j] *= 3;
                }
            System.out.println("1st line * 3:");
            System.out.println(Arrays.toString(myArray[0]));

        } else
            System.out.println("Enter number not equal to zero");
    }
}
