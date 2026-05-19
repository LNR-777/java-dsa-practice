package arrays;

// Problem: Given an array containing numbers from 1 to n,
// find the missing number.
//
// Example:
// Input:  [1, 2, 4, 5]
// Output: 3
//
// Approach:
// Calculate the expected sum using the formula:
// n * (n + 1) / 2
// Then subtract the actual array sum.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

public class FindMissingNumber {

    public static int findMissing(int[] arr, int n) {

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }


    public static void main(String[] args) {

        int[] arr1 = {1, 2, 4, 5};


        System.out.println(findMissing(arr1, 5));    // 3

        int[] arr2 = {2, 3, 1, 5};

        System.out.println(findMissing(arr2, 5)); // 4
    }
}