/*
 * 注：该方法为错误方法,但用到了几个方法，记录一下
 * 方法：二分查找；利用List去重
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution2 {

    public int[] intersect(int[] nums1, int[] nums2) {
        int[] null1 = new int[0];
        if (nums1.length == 0 || nums2.length == 0)
            if (nums1 == null)
                return nums1;
            else if (nums2 == null)
                return nums2;

        int[] result = new int[Math.max(nums1.length, nums2.length)];
        int order = 0;

        if (isBigger(nums1, nums2) == 1) {
            Arrays.sort(nums1);
            for (int i = 0; i < nums2.length; i++) {
                if (search(nums1, 0, nums1.length - 1, nums2[i]) == 1) {
                    result[order] = nums2[i];
                    order++;
                }
            }
        } else if (isBigger(nums1, nums2) == 2) {
            Arrays.sort(nums2);
            for (int i = 0; i < nums1.length; i++) {
                if (search(nums2, 0, nums2.length - 1, nums2[i]) == 1) {
                    result[order] = nums1[i];
                    order++;
                }
            }
        }
        int[] finalResult = new int[order];
        System.arraycopy(result, 0, finalResult, 0, order);

        return unique(finalResult);
    }

    public int search(int nums[], int left, int right, int k) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (k == nums[mid])
                return 1;
            else if (k > nums[mid])
                left = mid + 1;
            else if (k < nums[mid])
                right = mid - 1;
        }
        return 0;
    }

    public int isBigger(int[] nums1, int[] nums2) {
        if (nums1.length >= nums2.length)
            return 1;
        else
            return 2;
    }

    public int[] unique(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for(int num:nums)
            if(!list.contains(num))
                list.add(num);

        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++)
            result[i] = list.get(i);
        return result;
    }//数组去重
}