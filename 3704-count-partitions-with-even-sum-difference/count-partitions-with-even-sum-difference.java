class Solution {
    public int countPartitions(int[] nums) {
        int cnt=0;
        int sum1=0;
        int sum2=0;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            sum1=sum1+nums[i];
            for(int j=i+1;j<n;j++){
                sum2=sum2+nums[j];
            }
            if((sum1+sum2)%2==0){
                cnt++;
            }
            sum2=0;
        }
        return cnt;
        
    }
}