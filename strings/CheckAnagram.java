package strings;

// Problem: Check if two strings are anagrams.
// Naive approach: sort both strings and compare — O(n log n).
// Better approach: use a frequency count array (26 letters a-z).
//   Increment count for each char in str1, decrement for each char in str2.
//   If all counts return to zero, they are anagrams.
// Time: O(n) | Space: O(1) — fixed size 26 array

public class CheckAnagram {

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        int[] count = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent")); // true
        System.out.println(isAnagram("hello", "world"));   // false
        System.out.println(isAnagram("rat", "car"));      // false
    }
}