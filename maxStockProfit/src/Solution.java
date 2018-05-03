public class Solution {
    public int maxProfit(int[] prices) {
        int maxIncome = 0;//总收益
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] >= prices[i])
                maxIncome += prices[i + 1] - prices[i];//有收益就买卖
        }
        return maxIncome;
    }
}
