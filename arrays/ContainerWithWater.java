package arrays;

// Problem: Find max water a container can hold between two lines
// Approach: Two pointers from both ends
//           Water = min(height[left], height[right]) * (right - left)
//           Move the SHORTER pointer inward — the taller side cannot
//           help unless the shorter side improves.
// Time: O(n) | Space: O(1)

public class ContainerWithWater {

    public static int maxWater(int[] height) {
        int left     = 0;
        int right  = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            int water = Math.min(height[left], height[right]) * (right - left);
            maxWater  = Math.max(maxWater, water);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        System.out.println(maxWater(new int[] {1,8,6,2,5,4,8,3,7}));    // 49
        System.out.println(maxWater(new int[]{1, 1}));                  // 1
        System.out.println(maxWater(new int[]{4,3,2,1,4}));          // 16
    }
}