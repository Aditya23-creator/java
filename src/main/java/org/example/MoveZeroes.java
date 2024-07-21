package org.example;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums =  {1,2,0,4,3,0,5,0};
        System.out.println("Original Array is "+ Arrays.toString(nums));
        moveZeroes(nums);
        System.out.println(" Modified Array is " + Arrays.toString(nums));
    }
    public static int[] moveZeroes(int[] nums) {

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }
        return nums;
    }
}

