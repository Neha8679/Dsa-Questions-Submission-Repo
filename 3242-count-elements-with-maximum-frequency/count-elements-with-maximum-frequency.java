class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        int[] hash=new int[101];
        int max=0;
        for(int i=0;i<n;i++){
            hash[nums[i]]++;
            max=Math.max(max,hash[nums[i]]);
        }
        int ans=0;
        for(int i=0;i<101;i++){
            if(hash[i]==max){
                ans=ans+hash[i];
            }
        }
        return ans;
        
    }
}