class Solution {
    public long splitArray(int[] nums) {
        int n=nums.length;
        
        long countA=0;
        long countB=0;
        for(int i=0;i<n;i++){
            if(primeindex(i)){
                
                countA=countA+nums[i];
            }
            else{

                countB=countB+nums[i];
            }
        }
        return Math.abs(countA-countB);
        

        
    }
    public boolean primeindex(int x){
        if(x<=1) return false;
        for(int i=2;i*i<=x;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;

    }
}