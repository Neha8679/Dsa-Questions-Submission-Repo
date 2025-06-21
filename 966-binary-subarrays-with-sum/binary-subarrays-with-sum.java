class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atmost(nums,goal)-atmost(nums,goal-1);
    }
    private int atmost(int[] nums, int k) {
        if(k<0){
            return 0;
        }
        int n= nums.length;
        int l=0;
        int r=0;
        
        int maxarr=0;
        int sum=0;
        while(r<n){
            
            sum=sum+nums[r];
            while(sum>k){
                sum-=nums[l];
                l++;

            }
            maxarr=maxarr+(r-l+1);
            r++;

        }
        return maxarr;
        
    }
}