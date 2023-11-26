import java.util.Arrays;

/*
 * Date:  2023.11.27
 * Url: https://leetcode.cn/problems/maximum-subarray/
 * Title: 53. 最大子数组和
 *
 */
public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.maxSubArray3(new int[]{5,-6,-3,7,8}));
        System.out.println("Hello world!");
    }


    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int max = nums[0];
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            current = Math.max(current + nums[i], nums[i]);
            max = Math.max(current, max);
        }

        return max;
    }

    public int maxSubArray2(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            max = Math.max(current, max);
            for (int j = i + 1; j < nums.length; j++) {
                current = current + nums[j];
                max = Math.max(current, max);
            }
        }

        return max;
    }

    public int maxSubArray3(int[] nums) {
        // 如果不存在负数，最大连续子数组即数组本身
        // 存在负数，和累加过程中会导致和减小，只需要在计算前缀和时把前部分最小的前缀和减去，剩下的就是最大的，依次更新答案
        int prefixMin = 0, sum = 0, ans = Integer.MIN_VALUE;
        for(int num : nums) {
            sum += num;
            ans = Math.max(ans,sum - prefixMin);
            prefixMin = Math.min(sum,prefixMin);
        }
        return ans;
    }
}