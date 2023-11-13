/*
 * Date:  2023.11.11
 * Url:   https://leetcode.cn/problems/kth-largest-element-in-an-array/
 * Title: 215. 数组中的第K个最大元素
 *
 */

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
//        int[] a = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
//        System.out.println(new Solution().quickChoose(0, 8, a, 7));

//        int[] a = new int[]{3, 2, 1, 5, 6, 4};
//        new Solution().qsort(a, 0, 5,2);
//        System.out.println(Arrays.toString(a));
    }


    public int findKthLargest(int[] nums, int k) {
        int i = 0;
        int j = nums.length - 1;
        return qchoose(nums, i, j, k - 1);
    }

    public int qchoose(int[] nums, int i, int j, int k) {
        if (i >= j) {
            return nums[i];
        }
        int left = i;
        int right = j;
        int pivot = nums[left];
        while (left < right) {
            while (nums[left] > pivot && left < right) {
                left++;
            }
            while (nums[right] < pivot && left < right) {
                right--;
            }
            if (nums[left] == nums[right]) {
                right--;
            }

            if (left < right) {
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
            }
        }

        if (left < k) {
            return qchoose(nums, left + 1, j, k);
        } else {
            return qchoose(nums, i, left, k);
        }
    }

    public static int quickChoose(int l, int r, int[] arr, int k) {
        //如果当前只有一个数存在
        if (l == r) {
            return arr[l];
        }
        //否则进行排序和查找
        int i = l - 1, j = r + 1, pivot = arr[l];
        //本次返回j,j + 1
        //当前元素区间不止为一个数时
        while (i < j) {
            do ++i; while (arr[i] < pivot);
            do --j; while (arr[j] > pivot);
            //如果满足区间元素不为1
            if (i < j) {
                int t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        //如果在左半部分，直接排序左边求解
        int s1 = j - l + 1;
        if (s1 >= k) {
            return quickChoose(l, i - 1, arr, k);
        } else {
            //否则排序右边数组
            k = k - s1;
            return quickChoose(i, r, arr, k);
        }
    }
}