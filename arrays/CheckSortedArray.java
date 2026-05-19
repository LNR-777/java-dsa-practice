package arrays;

// Problem: Check if the given array is sorted in non-decreasing order.
//
// Approach:
// Traverse the array and compare every element
// with its next element.
// If any current element is greater than the next,
// the array is not sorted.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

public class CheckSortedArray {

    public static boolean isSorted(int[] arr) {

        for (int i = 0;  i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr1));     // true

        int[] arr2 = {1, 3, 2, 4, 5};
        System.out.println(isSorted(arr2)); // false

        int[] arr3 = {10};
        System.out.println(isSorted(arr3));       // true
    }
}