//package com.max.idea;

import java.util.Scanner;
import java.util.Arrays;

public class Taskseven {
    public static void main(String[] args) {
        final double x = 1.1111;
        final double y = 2.2222;
        final double z = 3.3333;
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose type of your array \n 1 - if your array - one-dimensional \n 2 - if your array -two-dimensional");
        int dim = scan.nextInt();
        if (dim == 1) {
            System.out.println("Enter the length of your array");
            int size = scan.nextInt();
            double[] myArray = new double[size];
            if (size != 0) {

                System.out.println("Enter items of your array");
                for (int i = 0; i < size; i++) {
                    myArray[i] = scan.nextDouble();
                }
                System.out.println("Your array.");
                System.out.print("[");
                for (int i = 0; i < size; i++) {

                    System.out.print(myArray[i] + " ");
                }
                System.out.print("] \n");
                for (int i = 0; i < size; i++) {
                    if (myArray[i] == x || myArray[i] == y || myArray[i] == z)
                        System.out.println("Your item " + myArray[i] + ". Данное значение имеется в константах");
                }
            }
            else
                System.out.println("Your array []. Enter length not equal to zero");
        } else if (dim == 2) {
            System.out.println("Enter number of rows");
            int rows = scan.nextInt();
            System.out.println("Enter number of columns");
            int cols = scan.nextInt();
            double[][] myArray = new double[rows][cols];
            if (rows !=0 && cols != 0) {

                System.out.println("Enter items of your array. First the first line, etc");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        myArray[i][j] = scan.nextDouble();
                    }
                }
                System.out.println("Your array.");
                for (int i = 0; i < rows; i++) {
                    System.out.println(Arrays.toString(myArray[i]));
                }
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        if (myArray[i][j] == x || myArray[i][j] == y || myArray[i][j] == z)
                            System.out.println("Your item " + myArray[i][j] + ". Данное значение имеется в константах");
                    }
                }
            }
            else
                System.out.println("Enter number not equal to zero");
        } else
            System.out.println("You entered an invalid value");

    }
}
