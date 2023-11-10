/*
 *注：两次循环，每一次将最高位移动到第一位，再移动其余位
 */

class Solution2 {
    public void rotate(int[] nums, int k) {
        if (nums.length == 0 || (k %= nums.length) == 0) {
            return;
        }//加快空数组或者0旋转的情况处理的速度

        while (k > 0) {
            int tail = nums[nums.length - 1];
            for (int i = nums.length - 2; i >= 0; i--) {
                nums[i + 1] = nums[i];
            }
            nums[0] = tail;
            k--;

        }
    }
}
