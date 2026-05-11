package arrays;

// Problem: Reverse the given array in-place.
//
// Approach:
// Use two pointers:
// one at the beginning and one at the end.
// Swap both elements and move pointers inward.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

public class ReverseArray {

    public static void reverse(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};

        reverse(arr1);

        printArray(arr1);  // 5 4 3 2 1
    }
}