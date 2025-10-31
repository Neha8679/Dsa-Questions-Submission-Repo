class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int cnt=1;
        int maxcnt=1;
        if(n==0){
            return 0;
        }
        for(int i=0;i<n-1;i++){
            if(nums[i+1]==nums[i]){
                continue;
            }
            else if(nums[i+1]==nums[i]+1){
                cnt++;
                
            }
            else{
                cnt=1;
            }
            maxcnt=Math.max(maxcnt,cnt);


        }
        return maxcnt;
        
    }
}