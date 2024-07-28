package org.example;

import java.util.Scanner;

public class SumOfDigitsOfNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = calculateSumOfDigits(number);
        System.out.println(" " +sum);
    }

    private static int calculateSumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            // Add the last digit to sum
            sum += n % 10;
            // After processed, Remove the last digit from number
            n /= 10;
        }
        return sum;
    }

}
