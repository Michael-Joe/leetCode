/*
 * 注：
 * 思想：排序之后比较相邻元素，这里的排序利用的是java自带的排序函数
 */

import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 0)
            return false;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}