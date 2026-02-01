class Solution {
    public int minimumCost(int[] nums) {
        int sum=nums[0];

        Arrays.sort(nums);
       if(sum!=nums[0] && sum!=nums[1]){
        sum=sum+nums[0]+nums[1];

       }
       else{
        return nums[0]+nums[1]+nums[2];

       }
        return sum;
        
    }
}