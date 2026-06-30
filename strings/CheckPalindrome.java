package strings;

// Problem: Check if a string is a palindrome.
// Approach: Two pointers from both ends, compare characters moving inward.
//           If any mismatch is found, return false immediately.
//           No need to reverse and compare — that wastes O(n) extra space.
// Time: O(n) | Space: O(1)

public class CheckPalindrome {

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++; right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));    // true
        System.out.println(isPalindrome("hello")); // false
        System.out.println(isPalindrome("a"));     // true
    }
}