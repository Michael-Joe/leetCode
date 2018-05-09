/*
 * Date:  2018.05.07
 * Url:   https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/26/
 * Title: 两个数组的交集 II
 *
 */

public class Main {
    public static void main(String[] args){
        int[] nums1={1,1,2,3};
        int[] nums2={1,1,2,3};

        Solution handler = new Solution();
        for(int num:handler.intersect(nums1,nums2)){
            System.out.println(num);
        }

    }
}
