class Solution {
    public int removeElement(int[] nums, int val) {
        // int n=nums.length;
        // StringBuilder s=new StringBuilder();
        // int cnt=0;
        // int k=0;
        // for(int i=0;i<n;i++){
        //     if(nums[i]==val){
        //         cnt++;
        //     }
        //     else{
        //         s=s.append(nums[i]);
        //     }
        // }
        // int m=s.length();
        // int[] arr=new int[m];
        // for(int j=0;j<m;j++){
        //     arr[j]=s.charAt(j)-'0';
        // }
        // return arr;
        int n=nums.length;
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
        
    }
}