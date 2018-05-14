/*
 * 注：该方法减少了时间复杂度，O(nlogn)
 * 思路：首先进行了排序，之后利用了首尾指针（这里指数组下标）向内查找
 */

import java.util.Arrays;

class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        int[] numsTransfer = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            numsTransfer[i] = nums[i];

        int[] result = new int[2];
        Arrays.sort(numsTransfer);
        int i = 0, j = nums.length - 1;
        while (i < j) {
            if ((numsTransfer[i] + numsTransfer[j]) == target) {
                result[0] = i;
                result[1] = j;
                break;
            } else if ((numsTransfer[i] + numsTransfer[j]) < target)
                i++;
            else
                j--;
        }


        if (numsTransfer[result[0]] == numsTransfer[result[1]]) {
            for (int k = 0, l = 0; k < nums.length; k++) {
                if (nums[k] == numsTransfer[result[l]]) {
                    result[l++] = k;
                }
                if (l > 1)
                    break;
            }
            return result;
        }
        for (int k = 0; k < nums.length; k++) {

            if (nums[k] == numsTransfer[result[0]]) {
                result[0] = k;
                break;
            }
        }
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] == numsTransfer[result[1]]) {
                result[1] = k;
                break;
            }
        }
//        Arrays.sort(result);//该行可省略
        return result;
    }
}
