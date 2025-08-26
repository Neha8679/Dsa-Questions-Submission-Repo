class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int l=dimensions.length;
        int m=0;
        int n=0;
        double len=0;
        int ans=0;
        double maxlen=0;
        for(int i=0;i<l;i++){
            m=dimensions[i][0];
            n=dimensions[i][1];
            len=m*m+n*n;
            int area=m*n;
            if(len>maxlen){
                maxlen=len;
                ans=area;

            }
            else if(maxlen==len){
                ans=Math.max(area,ans);
            }
        }
        return ans;
        
    }
}