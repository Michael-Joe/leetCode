/*
 * Date:  2018.05.05
 * Url:   https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/23/
 * Title: 旋转数组
 *
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {-1, -100, 3, 99};
        int k = 3;

        Solution1 handler1 = new Solution1();
        Solution2 handler2 = new Solution2();
        Solution3 handler3 = new Solution3();
        Solution4 handler4 = new Solution4();

        //handler1.rotate(arr1, k);
        handler2.rotate(arr1, k);
        //handler3.rotate(arr1, k);

        //System.out.println(Arrays.toString(handler1.rotate(arr1, k)));
        //System.out.println(Arrays.toString(arr1));


    }

}
