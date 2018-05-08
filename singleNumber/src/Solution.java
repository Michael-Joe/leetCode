/*
 * 注：
 * 思想：一次异或，即可得到唯一结果
 */

class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 0)
            return 0;

        int result = 0;
        for (int i = 0; i < nums.length; i++)
            result ^= nums[i];
        return result;
    }
}
