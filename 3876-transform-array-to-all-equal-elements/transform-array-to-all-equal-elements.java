class Solution {
    public int solve(int[] nums, int target){
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]!=target){
                nums[i]=-nums[i];
                nums[i+1]=-nums[i+1];
                cnt++;
            }
        }
        return nums[n-1]==target?cnt:Integer.MAX_VALUE;
    }
    public boolean canMakeEqual(int[] nums, int k) {
        return solve(nums.clone(),-1)<=k || solve(nums.clone(),1) <=k;
        
    }
}