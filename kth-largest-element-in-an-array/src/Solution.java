/*
 * Date:  2023.11.11
 * Url:   https://leetcode.cn/problems/kth-largest-element-in-an-array/
 * Title: 215. 数组中的第K个最大元素
 *
 */

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
//        System.out.println(new Solution().findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
        int[] a = new int[]{3, 2, 1, 5, 6, 4};
        new Solution().qsort(a, 0, 5);
        System.out.println(Arrays.toString(a));
    }


    public int findKthLargest(int[] nums, int k) {

        int i = 0;
        int j = nums.length - 1;
        int kOrigin = nums[k - 1];
        while (i < j) {
            if (nums[i] < kOrigin) {
                kOrigin = nums[j];
                nums[j] = nums[i];
                nums[i] = kOrigin;
                j--;
            } else {
                i++;
            }

            if (nums[j] > kOrigin) {
                kOrigin = nums[i];
                nums[i] = nums[j];
                nums[j] = kOrigin;
                i++;
            } else {
                j++;
            }

            if (i == k) {
                return nums[i];
            }
        }
        return nums[k - 1];
    }

    public void qsort(int[] nums, int i, int j) {
        if (i == j) {
            return;
        }
        while (i < j) {
            int half = (i + j) / 2;
            int value = nums[half];
            if (nums[i] < nums[half]) {
                value = nums[j];
                nums[j] = nums[i];
                nums[i]=value;
            } else {
                i++;
            }

            qsort(nums, i, half);
            qsort(nums, half + 1, j);
        }
    }

}