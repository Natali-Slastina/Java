//package com.max.idea;

import java.util.Scanner;

public class Uniqcounter {
    public static void main(String[] args) {
        System.out.println("Enter your n of your lines");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n < 0)
            System.out.println("You entered invalid value");
        else if (n == 0)
            System.out.println("You entered zero lines");
        else {
            String[] lines = new String[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter your string " + (i + 1) + ": ");
                lines[i] = scan.next();
            }
            int maxuniq = 0; // максимальное уникальное
            int indexsrt = 0; //индекс строки с макс
            //перебор по строкам
            for (int i = 0; i < lines.length; i++) {
                int chars = 0; //счетчик уникальных символов
                //перебор по символам в строке
                for (int j = 0; j < lines[i].length(); j++) {
                    char c = lines[i].charAt(j);
                    boolean isUnique = true;
                    //сравнение символа с другими символами в строке
                    for (int k = 0; k < lines[i].length(); k++) {
                        if (k == j)
                            continue;
                        if (c == lines[i].charAt(k)) {
                            isUnique = false;
                            break;
                        }
                    }
                    if (isUnique)
                        chars++;
                }
                if (chars > maxuniq) {
                    maxuniq = chars;
                    indexsrt = i;
                }
            }
            System.out.println("String with max of unique chars: " + lines[indexsrt]);
        }
    }
}
