class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n=colors.length();
        int ans=0;
        int prevTime=neededTime[0];

        for(int i=1;i<n;i++){
            char ch1=colors.charAt(i-1);
            char ch2=colors.charAt(i);
            if(ch1==ch2){
                ans=ans+Math.min(prevTime,neededTime[i]);
                prevTime=Math.max(prevTime,neededTime[i]);
            }
            else{
                prevTime=neededTime[i];
            }


        }
        return ans;
        
    }
}