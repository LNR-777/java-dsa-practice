package arrays;

// Problem: Find the maximum sum of a contiguous subarray.
// Approach: Kadane's Algorithm — at every index, we have two choices:
//           1. Extend the current subarray by adding arr[i]
//           2. Start a new subarray from arr[i]
//           We pick whichever is larger using Math.max().
//           We also track the global maximum seen so far.
//           Key insight: if currentSum becomes negative, it only
//           drags down the next element, so we reset it to arr[i].
// Time: O(n) — single pass
// Space: O(1) — only two variables used

public class MaxSubarraySum {

    public static int maxSubarraySum(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(maxSubarraySum(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        // Output: 6    subarray [4, -1, 2, 1]

        System.out.println(maxSubarraySum(new int[]{1, 2, 3, 4, 5}));
        // Output: 15

        System.out.println(maxSubarraySum(new int[]{-3, -1, -2}));
        // Output: -1
    }
}