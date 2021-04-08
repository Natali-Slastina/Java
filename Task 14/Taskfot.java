//package com.max.idea;

import java.util.Random;
import java.util.Scanner;

public class Taskfot {
    public static void main(String[] args) {
        //Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20
        Random random = new Random();
        int[] num = new int[15];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) Math.round((Math.random() * 41) - 20);
            System.out.println(num[i]);
        }
        //Выведите максимальный и минимальный элемент массива.
        int min, max;
        min = max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] < min)
                min = num[i];
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("min is: " + min + "; max is: " + max);
        //Из максимального и минимального значения выведите наибольшее по модулю.
        int res = Math.max(Math.abs(min), Math.abs(max));
        System.out.println("Max abs is: " + res);
    }
}
