package arrays;

// Problem: Find maximum product of a contiguous subarray.
// Tricky: negative * negative = large positive, so track both
//         max and min product at every step.
// Approach: At each index, new max = max(arr[i], max*arr[i], min*arr[i])
//           new min = min(arr[i], max*arr[i], min*arr[i])
//           Use a temp variable before overwriting maxSoFar.
// Time: O(n) | Space: O(1)

public class MaxProductSubarray {

    public static int maxProduct (int[] arr) {
        int  maxSoFar = arr[0];
        int minSoFar = arr[0];
        int result   = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int tempMax = Math.max(arr[i],
                    Math.max(maxSoFar * arr[i], minSoFar * arr[i]));
            minSoFar    = Math.min(arr[i],
                    Math.min(maxSoFar * arr[i], minSoFar * arr[i]));
            maxSoFar    = tempMax;
            result      = Math.max(result, maxSoFar);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{2, 3, -2, 4}));         // 6
        System.out.println(maxProduct(new int[]{-2, 0, -1}));    // 0
        System.out.println(maxProduct(new int[]{-2, 3, -4}));    // 24
    }
}