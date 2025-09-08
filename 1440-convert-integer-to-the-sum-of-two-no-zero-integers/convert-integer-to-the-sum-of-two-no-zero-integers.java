class Solution {
    public int[] getNoZeroIntegers(int n) {
        // int[] ans=new int[2];
        // if(n%2==0){
        //     ans[0]=1;
        //     ans[1]=n-1;
        // }
        // else{
        //     ans[0]=2;
        //     ans[1]=n-2;
        // }
        // return ans;
        

        int[] ans=new int[2];
        for(int i=1;i<n;i++){
            int j=n-i;
            if(!String.valueOf(i).contains("0") && !String.valueOf(j).contains("0")){
                ans[0]=i;
                ans[1]=j;
            }
        }
        return ans;
    }
}