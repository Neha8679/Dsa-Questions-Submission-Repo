class Solution {
    public int minimumArea(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int upperrow=m;
        int lowerrow=-1;
        int leftcolumn=n;
        int rightcolumn=-1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    upperrow=Math.min(upperrow,i);
                    lowerrow=Math.max(lowerrow,i);
                    leftcolumn=Math.min(leftcolumn,j);
                    rightcolumn=Math.max(rightcolumn,j);
                }
            }
            
        }
        if(lowerrow==-1){
                return 0;
            }
            int ans=(lowerrow-upperrow+1)*(rightcolumn-leftcolumn+1);
            return ans;
        
    }
}