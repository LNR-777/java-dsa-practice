package arrays;

// Problem: Given an array and a target, return indices of two numbers
//          that add up to the target. Exactly one solution exists.
// Approach: Use a HashMap to store each number and its index as we go.
//           For every element, check if (target - element) already exists
//           in the map. If yes, we found our pair. If no, store it.
//           This avoids the O(n^2) brute force of checking every pair.
// Time: O(n) — single pass through the array.
// Space: O(n) — HashMap stores up to n elements.

import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(arr[i], i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));

        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));


        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));

    }
}
