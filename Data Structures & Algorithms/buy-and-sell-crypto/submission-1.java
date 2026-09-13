class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;

        for(int i =1; i < prices.length;i++){
            int sell = prices[i];
            int temp = sell - min;
            profit = Math.max(profit,temp);

            if(sell < min) {
                min = sell;
            }
        }

        return profit;
    }
}
