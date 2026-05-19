package arrays;

// Problem: Remove duplicates from a sorted array
// and return the count of unique elements.
//
// Approach:
// Use two pointers.
// One pointer tracks the position of unique elements.
// Traverse the array and place unique elements at the front.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

public class RemoveDuplicates {

    public static int removeDuplicates(int[] arr) {

        if (arr.length == 0) {
            return 0;
        }

        int uniqueIndex = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] != arr[uniqueIndex]) {

                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }

        return uniqueIndex + 1;
    }

    public static void printArray (int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 1, 2, 2, 3, 4, 4};

        int uniqueCount = removeDuplicates(arr1);

        System.out.println("Unique Elements Count: " + uniqueCount);

        printArray(arr1, uniqueCount);
            // 1 2 3 4
    }
}