package arrays;

// Problem: Answer multiple range sum queries [l, r] efficiently.
// Naive approach: loop from l to r for each query — O(n) per query.
// Better approach: Prefix Sum — precompute a running total array once.
//   prefix[i] = arr[0] + arr[1] + ... + arr[i]
//   Then sum(l, r) = prefix[r] - prefix[l-1]  in O(1) per query.
// Build time: O(n) | Query time: O(1) | Space: O(n)

public class PrefixSum {

    private int[] prefix;

    public PrefixSum(int[] arr) {
        prefix = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
    }

    // returns sum of arr[l..r] inclusive
    public int rangeSum(int l, int r) {
        if (l == 0) return prefix[r];
        return prefix[r] - prefix[l - 1];
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        PrefixSum ps = new PrefixSum(arr);

        System.out.println(ps.rangeSum(1, 3)); // Output: 18  (4+6+8)
        System.out.println(ps.rangeSum(0, 4)); // Output: 30  (entire array)
        System.out.println(ps.rangeSum(2, 2)); // Output: 6   (single element)
    }
}