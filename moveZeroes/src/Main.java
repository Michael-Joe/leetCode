/*
 * Date:  2018.05.12
 * Url:   https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/28/
 * Title: 移动零
 *
 */

public class Main {
    public static void main(String[] args){
        int[] nums1={0,0,1,2,3};
        int[] nums2={1,2,0,3,4,0};

        Solution handler =new Solution();
        handler.moveZeroes(nums2);

        for(int num:nums2){
            System.out.print(num+",");
        }
    }
}
