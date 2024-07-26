package org.example;

import java.util.Arrays;

public class MinAndMaxInAnArray {

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 6, 2, 7};
        int[] res = findMinMax(arr);
        System.out.println(Arrays.toString(res));
    }

    private static int[] findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            //since there is no -1 as element in given array, if array is empty it will have -1 indicating no min,max
            return new int[]{-1, -1};
        }

        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return new int[]{min, max};
    }
}
