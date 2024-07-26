package org.example;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 1};
        findMostFrequentElement(arr);

    }

    private static void findMostFrequentElement(int[] arr) {
        // Create a HashMap to store the frequency of each element
        Map<Integer, Integer> map = new HashMap<>();

        // Count the frequency of each element in the array
        for (int el : arr) {
            map.put(el, map.getOrDefault(el, 0) + 1);
        }

        // Find the element with the maximum frequency
        int maxFrequency = 0;
        int mostFrequentElement = -1; // if no element is found with max freq
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequentElement = entry.getKey();
            }
        }
        System.out.println(mostFrequentElement + " appears " + maxFrequency + " times in the array.");
    }
}
