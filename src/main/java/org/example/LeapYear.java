package org.example;

public class LeapYear {

    public static void main(String[] args) {
        int[] years = {1990, 2024};
        for (int year : years) {
            System.out.println("Input: " + year + " is " + isLeapYear(year));
        }
    }

    private static String isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return "Leap Year";
                } else {
                    return "Non Leap Year";
                }
            } else {
                return "Leap Year";
            }
        } else {
            return "Non Leap Year";
        }
    }
}
