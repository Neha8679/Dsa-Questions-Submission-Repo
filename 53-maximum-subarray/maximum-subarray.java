class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int a=0;
        int b=0;
        int sum=0;
        int ans=0;
        int maxsum=Integer.MIN_VALUE;
        while(b<n){
            sum=sum+nums[b];
            if(sum>maxsum){
                maxsum=sum;
                

            }
            if(sum<0){
                sum=0;
                a=b+1;
            }
            
            b++;

        }
        return maxsum;

        
    }
}