/*
 * 注：利用ij两个下标，分别跟进原数组序列不为0的数字和新序列，最后将空闲位数置零
 */

class Solution {
    public void moveZeroes(int[] nums) {

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }

        for (; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}
