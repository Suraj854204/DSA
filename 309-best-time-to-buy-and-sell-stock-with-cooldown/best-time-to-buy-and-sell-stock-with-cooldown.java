class Solution {
    public int maxProfit(int[] prices) {
        int buy = -prices[0];
        int sell = 0;
        int rest = 0;

        for (int i = 1; i < prices.length; i++) {
            int prevbuy = buy;
            int prevsell = sell;
            int prevrest = rest;

            buy = Math.max(prevbuy, prevrest - prices[i]);
            sell = prevbuy + prices[i]; 
            rest = Math.max(prevrest, prevsell);
        }

        return Math.max(sell, rest);
    }
}