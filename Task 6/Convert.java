//package com.max.idea;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        //Ввести массу или расстояние
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose your param \n if distance - 1 \n if weight - 2");
        int param = scan.nextInt();
        if (param<=0 || param>2)
            System.out.println("You entered an invalid value");
        else {
            if (param == 1) {
                System.out.println("Choose your unit of measurement \n " +
                        "if metre - 1 \n if mile - 2 \n if yard - 3 \n if foot - 4");
                int unit = scan.nextInt();
                if (unit<=0 || unit>4)
                    System.out.println("You entered an invalid value");
                else {
                    double metre;
                    double mile;
                    double yard;
                    double foot;
                    System.out.println("Enter your num");
                    int num = scan.nextInt();
                    if (unit == 1) {
                        metre = num;
                        mile = num * 0.000621371;
                        yard = num * 1.09361;
                        foot = num * 3.28084;
                    } else if (unit == 2) {
                        mile = num;
                        metre = num * 1609.34;
                        yard = num * 1760;
                        foot = num * 5280;

                    } else if (unit == 3) {
                        yard = num;
                        metre = num * 0.9144;
                        mile = num * 0.000568182;
                        foot = num * 3;
                    } else {
                        foot = num;
                        metre = num * 0.3048;
                        mile = num * 0.000189394;
                        yard = num * 0.333333;
                    }
                    System.out.println("Your num is " + num);
                    System.out.println("result" + "\n" + "metre:" + metre + "\n" + "mile: " + mile + "\n"
                                + "yard: " + yard + "\n" + "fut: " + foot);
                }
            } else {
                if (param == 2) {
                    System.out.println("Choose your unit of measurement \n " +
                            "if kilogram - 1 \n if american ton- 2 \n if pound Lb - 3 \n if ounce Oz - 4");
                    int unit = scan.nextInt();
                    if (unit <= 0 || unit > 4)
                        System.out.println("You entered an invalid value");
                    else {
                        double kilo;
                        double amerton;
                        double pound;
                        double ounce;
                        System.out.println("Enter your num");
                        int num = scan.nextInt();
                        if (unit == 1) {
                            kilo = num;
                            amerton = num * 0.00110231;
                            pound = num * 2.20462;
                            ounce = num * 35.274;
                        } else if (unit == 2) {
                            amerton = num;
                            kilo = num * 907.185;
                            pound = num * 2000;
                            ounce = num * 32000;

                        } else if (unit == 3) {
                            pound = num;
                            kilo = num * 0.453592;
                            amerton = num * 0.0005;
                            ounce = num * 16;
                        } else {
                            ounce = num;
                            kilo = num * 0.0283495;
                            amerton = num * 0.00003125;
                            pound = num * 0.0625;
                        }
                        System.out.println("Your num is " + num);
                        System.out.println("result" + "\n" + "kilogram: " + kilo + "\n" + "american ton: " + amerton + "\n"
                                + "pound Lb: " + pound + "\n" + "ounce Oz: " + ounce);
                    }
                }
            }
        }

    }
}



