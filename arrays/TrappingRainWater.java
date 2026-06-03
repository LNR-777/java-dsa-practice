package arrays;

// Problem: How much rainwater is trapped between bars?
// Key insight: water at index i = min(maxLeft, maxRight) - height[i]
//              where maxLeft = tallest bar to the left of i
//                    maxRight = tallest bar to the right of i
// Naive: precompute leftMax[] and rightMax[] arrays — O(n) space.
// Optimal: two pointers — avoid extra arrays entirely.
//   If leftMax < rightMax: water at left is determined, process left.
//   Else: water at right is determined, process right.
// Time: O(n) | Space: O(1)

public class TrappingRainWater {

    public static int trap(int[] height) {

        int left     = 0,   right = height.length - 1;
        int  leftMax  = 0, rightMax = 0;
        int water    = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];

                } else {
                    water += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        System.out.println(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));           // 6
        System.out.println(trap(new int[]{4,2,0,3,2,5}));              // 9
        System.out.println(trap(new int[]{3,0,2,0,4}));               // 7
    }
}
