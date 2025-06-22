class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k) - atmost(nums,k-1);
        
    }
    private int atmost(int[] nums , int k){
        int r=0;
        int l=0;
        int n=nums.length;
        int count=0;
        int maxarr=0;
        while(r<n){
            if(nums[r]%2!=0){
                k--;
            }
             while (k < 0) {
                if (nums[l] % 2 != 0) {
                    k++;
                }
                l++;
            }
            maxarr+=r-l+1;
            r++;

        }
        return maxarr;

    }
}