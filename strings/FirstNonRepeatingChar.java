package strings;

// Problem: Find the first non-repeating character in a string.
// Approach: Two passes.
//   Pass 1: build a frequency map of every character using LinkedHashMap
//           (preserves insertion order, unlike HashMap).
//   Pass 2: walk through the string in order, return the first character
//           whose frequency is exactly 1.
// Time: O(n) | Space: O(n) — for the frequency map

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static Character firstNonRepeating(String str) {
        Map<Character, Integer> freq = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (char c : str.toCharArray()) {
            if (freq.get(c) == 1) {
                return c;
            }
        }
        return null; // no non-repeating character found
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeating("swiss"));   // w
        System.out.println(firstNonRepeating("aabb"));  // null
        System.out.println(firstNonRepeating("java")); // j
    }
}