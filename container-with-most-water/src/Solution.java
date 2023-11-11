/*
 * Date:  2023.11.11
 * Url:   https://leetcode.cn/problems/container-with-most-water
 * Title: 11. 盛最多水的容器
 *
 */

public class Solution {
    public static void main(String[] args) {
//        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] height = new int[]{0, 2};
        System.out.println(new Solution().maxArea(height));
    }

    // 超时间了，这个O(n2)扛不住，要剪枝
    public int maxArea1(int[] height) {
        int maxWater = 0;
        int currentMaxHeight = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = height.length - 1; j >= 0; j--) {
                if (height[j] == 0) {
                    continue;
                }
                int high = Math.min(height[i], height[j]);
                if (high >= currentMaxHeight) {
                    maxWater = Math.max(maxWater, high * (j - i));
                    currentMaxHeight = high;
                }
            }
        }
        return maxWater;
    }

    public int maxArea(int[] height) {
        int maxWater = 0;
        for (int i = 0, j = height.length - 1; i < height.length && j >= 0 && i <= j; ) {
            if (height[i] == 0) {
                i++;
            }
            if (height[j] == 0) {
                j--;
            }
            int width = j - i;

            if (height[i] > height[j]) {
                maxWater = Math.max(maxWater, height[j] * (width));
                // 尝试找下一个更高的
                j--;
            } else {
                maxWater = Math.max(maxWater, height[i] * (width));
                // 尝试找下一个更高的
                i++;
            }
        }
        return maxWater;
    }
}