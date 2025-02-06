class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n=prices.size();
        int buy_day=prices[0];
        int sale_day=prices[0];
        int max_sale=0;
        int x;
        for(int i=1;i<n;i++){
            if(buy_day>prices[i]){
                buy_day=prices[i];
            }
            else {
                max_sale=max(max_sale,prices[i]-buy_day);

            }
            
        }
        

        return max_sale;
        
    }
};