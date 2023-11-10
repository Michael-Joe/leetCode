/*
 * 注:该方法比较暴力（时间复杂度O(n^2)）
 * 思路：两次for循环，直接取和为目标值的两个数的下标，这里注意第二层循环的起点是i+1
 */

import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }

            }
        }
//        Arrays.sort(result);//非必须
        return result;
    }
}