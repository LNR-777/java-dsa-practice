# Arrays

## What is an array?
An array stores multiple values of the same type in contiguous
memory locations. Each element is accessed using an index
starting from 0.

Think of it like a row of lockers — each locker has a number,
and you can go directly to any locker without checking the others.

## Key points
- Fixed size in Java
- Access by index: O(1)
- Search (unsorted): O(n)
- Insertion/Deletion: O(n) due to shifting

## Problems solved

| # | File | Problem | Approach | Time | Space |
|---|------|---------|----------|------|-------|
| 1 | FindLargest.java | Find largest element | Single pass | O(n) | O(1) |
| 2 | FindSmallest.java | Find smallest element | Single pass | O(n) | O(1) |
| 3 | ReverseArray.java | Reverse array in-place | Two pointers | O(n) | O(1) |
| 4 | CheckSortedArray.java | Check if array is sorted | Single pass comparison | O(n) | O(1) |
| 5 | SecondLargest.java | Second largest element | Single pass, two vars | O(n) | O(1) |
| 6 | TwoSum.java | Two numbers adding to target | HashMap | O(n) | O(n) |
| 7 | LeftRotateByOne.java | Rotate array left by 1 | Shift + store first | O(n) | O(1) |
| 8 | MaxSubarraySum.java | Max sum contiguous subarray | Kadane's Algorithm | O(n) | O(1) |
| 9 | MoveZeros.java | Move zeros to end in-place | insertPos pointer | O(n) | O(1) |
| 10 | PrefixSum.java | Range sum queries | Prefix sum array | O(1)/query | O(n) |
| 11 | BestTimeToBuyStock.java | Max stock profit | Track min price | O(n) | O(1) |
| 12 | FindMissingNumber.java | Find missing number in [0,n] | Math sum formula | O(n) | O(1) |
| 13 | RemoveDuplicates.java | Remove dupes from sorted array | Two pointers | O(n) | O(1) |
| 14 | LeadersInArray.java | Find leader elements | Traverse right to left | O(n) | O(1) |
| 15 | UnionOfTwoArrays.java | Union of two arrays | HashSet | O(n+m) | O(n+m) |
| 16 | ContainerWithWater.java | Max water between lines | Two pointers | O(n) | O(1) |
| 17 | MaxProductSubarray.java | Max product subarray | Track max & min | O(n) | O(1) |
| 18 | TrappingRainWater.java | Rainwater trapped between bars | Two pointers | O(n) | O(1) |
| 19 | ThreeSum.java | All unique triplets summing 0 | Sort + two pointers | O(n²) | O(1) |
| 20 | RotateArrayByK.java | Rotate array right by k | Triple reverse trick | O(n) | O(1) |