class Solution {
    public int jump(int[] nums) {
        int jump=0;
        int currentEnd=0;
        int fartest=0;
        for(int i=0;i<nums.length-1;i++){
            fartest=Math.max(fartest,i+nums[i]);
            if(i==currentEnd){
                jump++;
                currentEnd=fartest;
            }
        }
        return jump;

        
    }
}