import java.util.HashMap;

/*
 * Date:  2023.11.11
 * Url:   https://leetcode.cn/problems/longest-substring-without-repeating-characters/
 * Title: 3. 无重复字符的最长子串
 *
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring(" "));
    }

    // 暴力O(n2)循环
    public int lengthOfLongestSubstring1(String s) {
        char[] chars = s.toCharArray();
        int totalLength = 0;
        for (int i = 0; i < chars.length; i++) {
            HashMap<Character, Byte> charMap = new HashMap<>();
            int currentLength = 0;
            for (int j = i; j < chars.length; j++) {
                if (charMap.containsKey(chars[j])) {
                    currentLength = Math.max(currentLength, j - i);
                    break;
                } else {
                    charMap.put(chars[j], (byte) 1);
                    currentLength++;
                }
            }
            totalLength = Math.max(totalLength, currentLength);
        }
        return totalLength;
    }

    // 滑动窗口
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int totalLength = 0;
        int left = 0;
        HashMap<Character, Integer> charMap = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            if (charMap.containsKey(chars[i])) {
                left = Math.max(left, charMap.get(chars[i]) + 1);
            }
            // 实际上关键在这里，map的value存储的是数组下标
            charMap.put(chars[i], i);
            totalLength = Math.max(totalLength, i - left + 1);
        }
        return totalLength;
    }
}