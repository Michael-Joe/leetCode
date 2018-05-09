/*
 * 注：
 * 思想：排序之后比较两个数组的每个元素，取出来
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] null1 = new int[0];
        if (nums1.length == 0 || nums2.length == 0)
            if (nums1 == null)
                return nums1;
            else if (nums2 == null)
                return nums2;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        List<Integer> tmp = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                tmp.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j])
                i++;
            else if (nums1[i] > nums2[j])
                j++;
        }

        int[] result = new int[tmp.size()];
        for (int k = 0; k < result.length; k++)
            result[k] = tmp.get(k);
        return result;
    }
}