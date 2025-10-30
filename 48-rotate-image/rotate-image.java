class Solution {
    public void rotate(int[][] matrix) {
        int m=matrix.length;
        int[][] ans=new int[m][m];
        
        
        
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                ans[i][j]=matrix[m-j-1][i];
            }
            
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=ans[i][j];
            }
        }
        
        
    }
}