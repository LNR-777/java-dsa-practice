package arrays;

// Problem: Move all zeros to end, keep non-zero order intact. In-place.
// Approach: Use a pointer 'insertPos' that tracks where the next
//           non-zero element should go. Walk through the array —
//           whenever we find a non-zero element, place it at insertPos
//           and advance insertPos. After the loop, fill remaining
//           positions from insertPos to end with zeros.
// Time: O(n) — single pass to place non-zeros + one more to fill zeros
// Space: O(1) — in-place, no extra array used

import java.util.Arrays;

public class MoveZeros {

    public static void moveZeros(int[] arr) {
        int insertPos = 0;

        // place all non-zero elements at the front
        for (int num : arr) {
            if (num != 0) {
                arr[insertPos++] = num;
            }
        }

        // fill remaining positions with zero
        while (insertPos < arr.length) {
            arr[insertPos++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 3, 12};
        moveZeros(arr1);
        System.out.println(Arrays.toString(arr1));
        // Output: [1, 3, 12, 0, 0]

        int[] arr2 = {0, 0, 1};
        moveZeros(arr2);
        System.out.println(Arrays.toString(arr2));
        // Output: [1, 0, 0]

        int[] arr3 = {1, 2, 3};
        moveZeros(arr3);
        System.out.println(Arrays.toString(arr3));
        // Output: [1, 2, 3]  →  no zeros, nothing changes
    }
}