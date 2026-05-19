package arrays;

// Problem: Find all leaders in the array.
//
// A leader is an element greater than all elements
// to its right side.
//
// Example:
// Input:  [16, 17, 4, 3, 5, 2]
// Output: 17 5 2
//
// Approach:
// Traverse the array from right to left.
// Keep track of the maximum element seen so far.
// If current element is greater than max,
// it is a leader.
//
// Time Complexity: O(n)
// Space Complexity: O(1)



public class LeadersInArray {

    public static void findLeaders(int[] arr) {

        int maxFromRight = arr[arr.length - 1];

        System.out.print("Leaders: " + maxFromRight + " ");

        for (int i = arr.length - 2; i >= 0; i--) {

            if (arr[i] > maxFromRight) {

                maxFromRight = arr[i];

                System.out.print(maxFromRight + " ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {


        int[] arr1 = {16, 17, 4, 3, 5, 2};

        findLeaders(arr1);
         // 2 5 17
    }
}
