class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        boolean[] seen=new boolean[n];
        for(int i=0;i<n;i++){
            if(!seen[nums[i]]){
                seen[nums[i]]=true;
            }
            else{
                return nums[i];
            }
        }
        return -1;
        
    }
}