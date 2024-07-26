package org.example;

import java.util.Arrays;

public class SumOfEvenOddNumbers {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] res = findSumOfEvenOddNo(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] findSumOfEvenOddNo(int[] arr) {
        int sumEven = 0;
        int sumOdd = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }
        return new int[]{sumEven, sumOdd};
    }
}
