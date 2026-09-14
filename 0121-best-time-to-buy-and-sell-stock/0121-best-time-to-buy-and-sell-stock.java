class Solution {
    public int maxProfit(int[] prices) {
        int minP=prices[0];
        int maxP=0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<minP) minP=prices[i];
            int profit=prices[i]-minP;
            if(profit>maxP) maxP=profit;
        }
        return maxP;
    }
}