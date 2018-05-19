/*
 * 注：直接将两个数组放到两个HashMap里，最后直接比较两个HashMap是否相等，得出结论
 */

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() == 0 && t.length() == 0) {
            return true;
        }
        if (s.length() != t.length())
            return false;

        Map<Character, Integer> Map_s = new HashMap<Character, Integer>();
        Map<Character, Integer> Map_t = new HashMap<Character, Integer>();

        for (char c : s.toCharArray()) {
            if (!Map_s.containsKey(c)) {
                Map_s.put(c, 1);
            } else {
                Map_s.put(c, Map_s.get(c) + 1);
            }
        }
        for (char c : t.toCharArray()) {
            if (!Map_t.containsKey(c)) {
                Map_t.put(c, 1);
            } else {
                Map_t.put(c, Map_t.get(c) + 1);
            }
        }

        if (!Map_s.equals(Map_t)) {
            return false;
        } else {
            return true;
        }
    }
}