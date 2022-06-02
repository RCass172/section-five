package com.zinkworks;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear (int year){
        boolean result = year % 100 != 0 || (year % 4 == 0 && year % 100 == 0 && year % 400 == 0);
        if (!(year >= 1 && year <= 9999) || (year % 4 != 0 && year % 400 != 0)) {
            result = false;
        }
        return result;
    }

    public static int getDaysInMonth(int month, int year) {
        int result;
        if (!(year >= 1 && year <= 9999) || !(month >= 1 && month <= 12)) {
            result = -1;
        } else {
            switch(month) {
                case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                    result = 31;
                    break;
                case 2:
                    if (isLeapYear(year)) {
                        result = 29;
                    } else {
                        result = 28;
                    }
                    break;
                default:
                    result = 30;
                    break;
            }
        }
        return result;
    }
}
