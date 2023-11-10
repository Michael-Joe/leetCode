/*
 *注：该方法不符合题目要求的原地算法，但仍不失为一个好算法；
 */

class Solution1 {
    public int[] rotate(int[] nums, int k) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[(i + k) % nums.length] = nums[i];
        }

        return result;
    }
}
