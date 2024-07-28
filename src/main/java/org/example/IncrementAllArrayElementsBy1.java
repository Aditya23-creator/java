package org.example;

import java.util.Arrays;

public class IncrementAllArrayElementsBy1 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        incrementArray(nums);
        //  Modified array
        System.out.println(Arrays.toString(nums));
    }

    private static void incrementArray(int[] nums) {
        // Traverse the array and increment each element by 1
        for (int i = 0; i < nums.length; i++) {
            nums[i] += 1;
        }
    }


}
