class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int breakpoint=-1;
        for(int i=n-1;i>=1;i--){
            if(nums[i-1]<nums[i]){
                breakpoint=i-1;
                break;
            }
        }
        if(breakpoint==-1){
            reverse(nums,0,n-1);
            return;

        }
        for(int i=n-1;i>breakpoint;i--){
            if(nums[i]>nums[breakpoint]){
                int temp=nums[i];
                nums[i]=nums[breakpoint];
                nums[breakpoint]=temp;
                break;
            }
        }
       reverse(nums,breakpoint+1,n-1);
        
    }
    public int[] reverse(int[] nums,int x,int y){
        while(x<y){
            int temp=nums[x];
            nums[x]=nums[y];
            nums[y]=temp;
            x++;
            y--;
        }
        return nums;
    }
}