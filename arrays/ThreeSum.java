package arrays;

// Problem: Find all unique triplets that sum to 0. No duplicate triplets.
// Approach: Sort the array first. Fix one element at index i,
//           then use two pointers (left=i+1, right=end) to find pairs
//           that sum to -arr[i]. Skip duplicates by checking adjacent values.
// Why sort? Sorting lets two pointers work and makes duplicate-skipping easy.
// Time: O(n^2) — O(n log n) sort + O(n^2) two-pointer scan
// Space: O(1) extra (output list not counted)

import java.util.*;

public class ThreeSum {


    public static List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {

            // skip duplicate values for the fixed element
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int left = i + 1, right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));

                    // skip duplicates for left and right
                    while (left < right && arr[left]  == arr[left  + 1]) left++;
                    while (left < right && arr[right] == arr[right - 1]) right--;
                    left++; right--;

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
              // Output: [[-1, -1, 2], [-1, 0, 1]]

        System.out.println(threeSum(new int[]{0, 0, 0}));
        // Output: [[0, 0, 0]]

        System.out.println(threeSum(new int[]{1, 2, -2, -1}));
        // Output: []
    }
}