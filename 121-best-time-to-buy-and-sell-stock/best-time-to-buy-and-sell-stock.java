class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int profit=0;
        int maxprofit=0;
        int buy=prices[0];
        for(int i=1;i<n;i++){
            int sell=prices[i];
            if(sell<buy){
                buy=sell;
            }
            else{
            profit=sell-buy;
            if(profit>maxprofit){
                maxprofit=Math.max(profit,maxprofit);
            }
            }
        }
        return maxprofit;
        
    }
}