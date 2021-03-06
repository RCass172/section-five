package com.zinkworks;

public class Main {
    public static void main(String[] args) {

        intSwitch(4);
        stringSwitch("February");

        // Day of week challenge
        DayOfWeek.printDayOfTheWeek(3);
        DayOfWeek.printDayOfTheWeek(39);

        // Num of days in month challenge
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2020)); // leap year
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2018));

        // For loop practice
        int count = 0;
        int sum = 0;
        for (int x = 1; x <= 1000; x++) {
            if (x % 3 == 0 && x % 5 == 0) {
                count ++;
                sum += x;
                System.out.println(x);
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println(sum);

        // Diagonal start challenge
        DiagonalStar.printSquareStar(9);
    }

    public static void intSwitch(int switchValue) {

        switch(switchValue) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was " + switchValue);
                //break;
            default:
                System.out.println("Value is not 1 or 2");
                break;
        }
    }

    public static void stringSwitch(String switchValue) {

        switch(switchValue.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            case "march":
                System.out.println("Mar");
                break;
            case "april":
                System.out.println("Apr");
                break;
            default:
                System.out.println("Value is not Jan to Apr");
                break;
        }
    }
}