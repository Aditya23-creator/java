package org.example;

import java.util.Scanner;

public class PrintOddNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = scanner.nextInt();
        printOddNo(N);
    }

    private static void printOddNo(int N) {
        if (N >= 2) {
            System.out.println(2);
        }
        for (int i = 3; i <= N; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

}
