class Solution {
    public int uniquePaths(int m, int n) {
        long ans=1;
        int total=m+n-2;
        int r=Math.min(m-1,n-1);
        for(int i=1;i<=r;i++){
            ans=ans*(total-r+i)/i;
        }
        return (int ) ans;

        
    }
}