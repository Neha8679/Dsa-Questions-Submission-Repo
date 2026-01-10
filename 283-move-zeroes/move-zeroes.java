class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        if(n==1){
            return ;
        }
        int a=0;
        int b=0;
        for(int i=0;i<n;i++){
            if(nums[a]==0 && nums[i]!=0){
                nums[a]=nums[i];
                nums[i]=0;
                a++;
                
            }
            if(nums[a]!=0){
                a++;
            }
           

        }
        
        
    }
}