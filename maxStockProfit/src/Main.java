/*
 * Date:  2018.05.04
 * Url:   https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/22/
 * Title: 买卖股票的最佳时机 II
 *
 */

public class Main {
    public static void main(String[] args){
        int[] price1 = {4,3,6,7,5,9};
        int[] price2 = {7,6,5,4,3};

        Solution handler = new Solution();
        System.out.println(handler.maxProfit(price1));

    }

}
