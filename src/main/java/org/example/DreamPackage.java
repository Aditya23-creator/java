package org.example;

import java.util.Scanner;

public class DreamPackage {
    public static void main(String[] args) {
        // Taking salary from user as argument
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary: ");
        int sal = sc.nextInt();
        System.out.println(isDreamPackage(sal));

    }
    private static String isDreamPackage(int salary) {
        if (salary > 500000) {
            return "DREAM";
        } else {
            return "NOTDREAM";
        }
    }
}
