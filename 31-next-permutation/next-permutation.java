class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int index=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }


        }
        if(index==-1){
            int l=0;
            int r=n-1;
            while(l<r){
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                l++;
                r--;
            }
        }
       else{
        for(int b=n-1;b>index;b--){
            if(nums[b]>nums[index]){
                int temp=nums[b];
                nums[b]=nums[index];
                nums[index]=temp;
                break;
            }
        }
        int k=index+1;
        int m=n-1;
        while(k<m){
            int temp=nums[k];
            nums[k]=nums[m];
            nums[m]=temp;
            k++;
            m--;
        }
       }
        
    }
}