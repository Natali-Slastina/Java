//package com.max.idea;


public class Array {
    public static void main(String[] args) {
       int[] a = {1,2,3,4,5}; //задать массив из 5 целых чисел
       a[0] = a[a.length - 1]; //поменять местами первый и последний элементы
       int mid = a.length/2; //получение среднего элемента
       int sum = a[0]+a[mid]; //сумма первого и среднего элементов
       System.out.print("Сумма первого и среднего элемента " + sum);

    }
}
