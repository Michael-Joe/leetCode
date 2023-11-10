/*
 *注：没搞懂原理，为什么从length-k拆分后的两个数组及原数组分别进行三次反转再组合就符合题意？
 *关键点：利用k把数组分两半；reverse左右两边数组；reverse总数组
 */

class Solution4 {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k % nums.length == 0)
            return;

        int middle = nums.length - k % nums.length;

        reverse(nums,0,middle-1);
        reverse(nums,middle,nums.length-1);
        reverse(nums,0,nums.length-1);

    }

    public void reverse(int[] nums, int begin, int end) {
        while (begin < end) {
            int temp = nums[begin];
            nums[begin] = nums[end];
            nums[end] = temp;

            ++begin;
            --end;
        }
    }
}
