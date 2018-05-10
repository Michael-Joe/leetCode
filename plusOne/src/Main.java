/*
 * Date:  2018.05.10
 * Url:   https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/27/
 * Title: 加一
 *
 */

public class Main {
    public static void main(String[] args) {
        int[] digits1={4,3,2,1};
        int[] digits2={9,9,9};
        int[] digits3={9,8,7,6,5,7,3,2,1,0};
        int[] digits4={9};
        int[] digits5={6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3};

        Solution handler=new Solution();
        int[] result = handler.plusOne(digits4);
        for(int num:result){
            System.out.print(num+",");
        }

    }
}
