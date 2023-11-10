/*
 * Date:  2023.11.11
 * Url:   https://leetcode.cn/problems/longest-palindromic-substring
 * Title: 5. 最长回文子串
 *
 */

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().longestPalindrome("bb"));
        ;
    }


    // 这个方法比较丑陋，而且不完善，处理不了偶数字符串刚好是回文串的情况，比如aabbaa，这个也能解决，字符串首尾和间隔都插入#字符，就可以把所有串都变成奇数串了
    @Deprecated
    public String longestPalindrome1(String s) {
        if (s.isEmpty() || s.length() == 1) {
            return s;
        }
        String resultFinal = "";
        for (int i = 1; i < s.length(); i++) {
            String result = "";
            if (s.charAt(i - 1) == s.charAt(i)) {
                result = s.substring(i - 1, i + 1);
            } else {
                result = String.valueOf(s.charAt(i));
            }
            for (int j = 1; j <= i && j < s.length() - i; j++) {
                if (s.charAt(i - j) == s.charAt(i + j)) {
                    result = s.substring(i - j, i + j + 1).length() > result.length() ? s.substring(i - j, i + j + 1) : resultFinal;
                    if (s.charAt(i) == s.charAt(i + j)) {
                        // 这种情况就是重复的单字
                        if ((i + j < s.length() - 1 && s.charAt(i) == s.charAt(i + j - 1)) || (i - j < 0 && s.charAt(i) == s.charAt(i - j + 1))) {
                            result = result + s.charAt(i);
                        }
                    }
                } else {
                    break;
                }
            }
            resultFinal = result.length() > resultFinal.length() ? result : resultFinal;
        }
        return resultFinal;
    }

    // 动态规划
    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        int left = 0;
        int mLength = 1;
        boolean[][] dp = new boolean[s.length()][s.length()];

        // 长度1的子串都是回文子串
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
        }
        // 按子串长度枚举
        for (int subLength = 2; subLength <= s.length(); subLength++) {
            for (int i = 0; i < s.length(); i++) {
                // 右边界
                int j = i + subLength - 1;
                if (j >= s.length()) {
                    break;
                }
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }

                if (dp[i][j] && subLength > mLength) {
                    left = i;
                    mLength = subLength;
                }
            }
        }
        return s.substring(left, left + mLength);
    }

}