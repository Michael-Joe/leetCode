/*
 *注：思路上与1类似，但满足了题目要求的原地算法
 */

class Solution3 {
    public void rotate(int[] nums, int k) {
        if (nums.length == 0 || (k %= nums.length) == 0)
            return;

        int count = 0;
        int i = 0, temp = nums[i];
        int start = 0;//用来防止某一位多次旋转

        while (count++ < nums.length) {
            i = (i + k) % nums.length;
            int cur = nums[i];
            nums[i] = temp;
            //本行if为关键，当i=start时，说明已经遍历完一组数据了，再继续会对第一个被旋转的数字进行二次修改，因而跳到第二个数，开始新一轮遍历
            if (i == start) {
                ++start;
                ++i;
                temp = nums[i];
            } else
                temp = cur;

        }
    }
}
