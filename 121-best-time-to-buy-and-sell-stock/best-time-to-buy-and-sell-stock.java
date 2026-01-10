class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int buy=prices[0];
        int profit=0;
        int maxprofit=0;
        for(int i=0;i<n;i++){
            int sell=prices[i];
            if(buy>sell){
                buy=sell;
            }
            else{
                profit=sell-buy;
                maxprofit=Math.max(profit,maxprofit);
            }
        }
        return maxprofit;
        
    }
}