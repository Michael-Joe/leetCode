/*
 * Date:  2023.11.27
 * Url: https://leetcode.cn/problems/longest-increasing-subsequence
 * Title: 300. 最长递增子序列
 *
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public int lengthOfLIS(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int result = 1;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
            result = Math.max(dp[i], result);
        }

        return result;
    }
}