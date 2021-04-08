//package com.max.idea;

import java.util.Scanner;

public class Taskthir {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = scan.nextLine();
        //Выведите слова, состоящие только из латиницы.
        System.out.println("Your string is updated:");
        String [] word = str.split("\\s+");
        int count = 0;
        for(int i =0; i<word.length;i++)
            if(word[i].matches("^[a-zA-Z]+$")) {
                System.out.print(word[i]+" ");
                count +=1;
            }
        //Выведите количество этих слов.
        System.out.print("\nWord count: " +count);
    }
}
