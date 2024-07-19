package org.example;

public class SecondLargestElement {


    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.print(secondLargest(arr));
    }

    public static int secondLargest(int[] arr) {
        if (arr.length < 2) {
            return -1; // Or throw an exception, depending on the requirement
        }
        int m1 = Integer.MIN_VALUE;
        int m2 = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > m1) {
                m1 = num;
            }
        }

        for (int num : arr) {
            if (num > m2 && num < m1) {
                m2 = num;
            }
        }

        if (m2 == Integer.MIN_VALUE) {
            return -1;
        }
        return m2;
    }

}
