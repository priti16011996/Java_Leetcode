public class BuyAndSellStock_121 {
    public int maxProfit(int[] prices) {
        int minBuyPrice = Integer.MAX_VALUE;
        int maxProfit =0;

        for(int i=0; i<prices.length; i++)
        {
            if(minBuyPrice < prices[i])
            {
                int profit = prices[i]-minBuyPrice;
                maxProfit = Math.max(profit,maxProfit);
            }
            else
            {
                minBuyPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
