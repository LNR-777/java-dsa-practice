package arrays;

// Problem: Find the union of two arrays.
//
// Union means all unique elements from both arrays.
//
// Example:
// Input:
// arr1 = [1, 2, 3, 4]
// arr2 = [3, 4, 5, 6]
//
// Output:
// 1 2 3 4 5 6
//
// Approach:
// Use HashSet to store unique elements
// from both arrays.
//
// Time Complexity: O(n + m)
// Space Complexity: O(n)


import java.util.HashSet;

public class UnionOfTwoArrays {

    public static void findUnion(int[] arr1, int[] arr2) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1) {

            set.add(num);
        }

        for (int num : arr2) {
            set.add(num);
        }

        System.out.println("Union Elements:");

        for (int num : set) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        findUnion(arr1, arr2);
    }
}