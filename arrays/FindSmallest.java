package arrays;

// Problem: Given an integer array, find and return the smallest element.
//
// Approach:
// Assume the first element is the smallest.
// Traverse the remaining array.
// Update the minimum whenever a smaller value is found.

// Time Complexity: O(n)
// Space Complexity: O(1)

public class FindSmallest {

    public static int findSmallest(int[] arr) {

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {

        int[] arr1 = {3, 7, 1, 9, 4};
        System.out.println(findSmallest(arr1));       // 1

        int[] arr2 = {-5, -1, -8, -2};
        System.out.println(findSmallest(arr2));     // -8

        int[] arr3 = {42};
        System.out.println(findSmallest(arr3));    // 42
    }
}