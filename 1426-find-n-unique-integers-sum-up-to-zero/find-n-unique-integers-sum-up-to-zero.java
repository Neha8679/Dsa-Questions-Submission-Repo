class Solution {
    public int[] sumZero(int n) {
        int i=0;
        int[] ans=new int[n];
        int num=1;
        while(i<n/2){
            ans[i]=num;
            ans[n-1-i]=-num;
            i++;
            num++;
        }
        if(n%2!=0){
            ans[n/2]=0;
        }
        return ans;
        
    }
}