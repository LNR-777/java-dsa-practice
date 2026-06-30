package strings;

// Problem: Reverse a string.
// Approach: Convert to char array, use two pointers from both ends,
//           swap characters moving inward. Same idea as ReverseArray.
//           Strings are immutable in Java, so we cannot swap directly
//           on the String object — that's why we use a char array.
// Time: O(n) | Space: O(n) — for the char array (Java strings are immutable)

public class ReverseString {

    public static String reverse(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            char temp   = chars[left];
            chars[left]  = chars[right];
            chars[right] = temp;
            left++; right--;

        }

        return new String(chars);
    }

    public static void main(String[] args) {

        System.out.println(reverse("hello"));     // olleh
        System.out.println(reverse("Java"));        // avaJ
        System.out.println(reverse("a"));        // a
    }
}
