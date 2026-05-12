package arrays;
// Problem: Find the second largest element in an array.
// Approach: Track two variables — largest and secondLargest.
//           Walk through the array once. If current element is greater
//           than largest, update secondLargest = largest, then largest.
//           If current is less than largest but greater than secondLargest,
//           update only secondLargest.
//           No sorting needed — sorting would cost O(n log n).
// Time: O(n) — single pass
// Space: O(1) — only two variables used

public class SecondLargest {

    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        System.out.println(findSecondLargest(new int[]{10, 5, 8, 20, 3}));
             // Output: 10

        System.out.println(findSecondLargest(new int[]{1, 1, 1, 1}));
        // Output: Integer.MIN_VALUE (no second largest)

        System.out.println(findSecondLargest(new int[]{5, 5, 4}));
        // Output: 4
    }
}