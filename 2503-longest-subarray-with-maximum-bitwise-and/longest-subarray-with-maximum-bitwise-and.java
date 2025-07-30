class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int max_val=0;
        int current_streak=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(max_val<nums[i]){
                max_val=nums[i];
                ans=current_streak=0;
            }
            if(max_val==nums[i]){
                current_streak++;

            }
            else{
                current_streak=0;
            }
            ans=Math.max(ans,current_streak);

        }
        return ans;
        
    }
}