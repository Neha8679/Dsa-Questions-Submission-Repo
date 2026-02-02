class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int l1=0;
        int r1=n-1;
        while(l1<r1){
            int temp=nums[l1];
            nums[l1]=nums[r1];
            nums[r1]=temp;
            l1++;
            r1--;

        }
        int l2=0;
        int r2=k-1;
        while(l2<r2){
            int temp=nums[l2];
            nums[l2]=nums[r2];
            nums[r2]=temp;
            l2++;
            r2--;
        }
        int l3=k;
        int r3=n-1;
        while(l3<r3){
            int temp=nums[l3];
            nums[l3]=nums[r3];
            nums[r3]=temp;
            l3++;
            r3--;
        }


        
    }
}