package arrays;

// Problem: Given an integer array, find and return the largest element.
//
// Approach:
// Assume the first element is the largest.
// Traverse the array from index 1.
// If any element is greater than current max,
// update the max value.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

public class FindLargest {

    public static int findLargest(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr1 = {3, 7, 1, 9, 4};
        System.out.println(findLargest(arr1)); // 9

        int[] arr2 = {-5, -1, -8, -2};
        System.out.println(findLargest(arr2)); // -1

        int[] arr3 = {42};
        System.out.println(findLargest(arr3)); // 42
    }
}