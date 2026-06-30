# Strings

## Key concept
Java Strings are immutable — every modification creates a new
String object. For frequent changes, use StringBuilder instead,
which is mutable and more efficient.

## Key points
- String comparison: use .equals(), never == (compares references)
- charAt(i): O(1) access to a character
- toCharArray(): convert String to char[] for in-place style operations
- StringBuilder: mutable, used for building strings efficiently

## Problems solved
| # | File | Problem | Approach | Time | Space |
|---|------|---------|----------|------|-------|
| 1 | ReverseString.java | Reverse a string | Two pointers on char array | O(n) | O(n) |
| 2 | CheckPalindrome.java | Check palindrome | Two pointers | O(n) | O(1) |
| 3 | CheckAnagram.java | Check anagram | Frequency count array | O(n) | O(1) |
| 4 | FirstNonRepeatingChar.java | First unique character | LinkedHashMap frequency | O(n) | O(n) |