package leetcode;

import java.util.HashSet;

// Longest Substring Without Repeating Characters
public class Solution02 {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, result = 0;
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            result = Math.max(result, right - left + 1);
        }
        return result;
    }
}
