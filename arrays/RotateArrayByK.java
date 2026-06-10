package arrays;

// Problem: Rotate array to the right by k positions. In-place.
// Key trick: Reverse the whole array, then reverse first k elements,
//            then reverse the remaining n-k elements.
// Why it works:
//   Original:        [1,2,3,4,5,6,7]  k=3
//   Reverse all:     [7,6,5,4,3,2,1]
//   Reverse first k: [5,6,7,4,3,2,1]
//   Reverse rest:    [5,6,7,1,2,3,4]  ← answer
// Handle k > n by doing k = k % n
// Time: O(n) | Space: O(1)

import java.util.Arrays;

public class RotateArrayByK {

    public static void rotate(int[] arr, int k) {

        int n = arr.length;
        k = k % n;             // handle k larger than array size

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp  = arr[left];
            arr[left] = arr[right];
            arr[right]= temp;
            left++; right--;
        }
    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6,7};
        rotate(arr1, 3);
        System.out.println(Arrays.toString(arr1)); // [5,6,7,1,2,3,4]

        int[] arr2 = {-1,-100,3,99};
        rotate(arr2, 2);
        System.out.println(Arrays.toString(arr2));   // [3,99,-1,-100]

        int[] arr3 = {1,2};
        rotate(arr3, 5);
        System.out.println(Arrays.toString(arr3));       // [2,1]
    }
}