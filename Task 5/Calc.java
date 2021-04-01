//package com.max.idea;


import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        //Ввести 2 числа с клавиатуры
        Scanner num = new Scanner(System.in);
        System.out.println("Enter your x, y");
        double x, y;
        x = num.nextDouble();
        y = num.nextDouble();

        //затем один из символов +, -, * или /
        System.out.println("Enter your sim: *, +, -, /");
        char sim;
        sim = num.next().charAt(0);
        System.out.println("Your sim is " + sim);

        //В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции
        if (sim =='*' || sim == '+' || sim =='-' || sim =='/'){
            double result;
            switch (sim) {
                case '*':
                    result = x * y;
                    System.out.println("result is  " + result);
                    break;
                case '+':
                    result = x + y;
                    System.out.println("result is " + result);
                    break;
                case '-':
                    result = x - y;
                    System.out.println("result is " + result);
                    break;
                case '/':
                    result = x / y;
                    System.out.println("result is " + result);
                    break;
                default:
                    System.out.println("Вы ввели некорректный символ - " + sim);

            }

        }
        else
            System.out.println("You entered an invalid value");

    }
}
