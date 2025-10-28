class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int buyday=prices[0];
        
        int profit=0;
        for(int i=1;i<n;i++){
            if(prices[i]<buyday){
                buyday=prices[i];
            }
            else{
            profit=Math.max(profit,prices[i]-buyday);
            }
        }
        return profit;
        
    }
}