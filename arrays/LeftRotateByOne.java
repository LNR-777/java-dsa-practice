package arrays;

// Problem: Left rotate the array by one position.
//
// Example:
// Input:  [1, 2, 3, 4, 5]
// Output: [2, 3, 4, 5, 1]
//
// Approach:
// Store the first element.
// Shift all remaining elements one step to the left.
// Place the first element at the last position.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

public class LeftRotateByOne {

    public static void leftRotate(int[] arr) {

        int firstElement = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {

            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = firstElement;
    }

    public static void printArray (int[] arr) {

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};

        leftRotate(arr1);

        printArray(arr1);
         // 2 3 4 5 1
    }
}