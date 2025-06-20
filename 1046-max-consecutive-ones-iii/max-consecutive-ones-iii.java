class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int l=0;
        int r=0;
        int zero=0;
        int len=0;
        int maxans=Integer.MIN_VALUE;
        while(r<n){
            if(nums[r]==0){
                zero++;
            }
            while(zero>k){
                if(nums[l]==0){
                    zero--;
                }
                l++;
            }
            if(zero<=k){
                len=r-l+1;
                maxans=Math.max(maxans,len);

            }
            else{
                break;
            }
            r++;
        }
        return maxans;
        
    }
}