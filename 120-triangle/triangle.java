// class Solution {
//     public int minimumTotal(List<List<Integer>> triangle) {
       
//         int ans=0;
//         for(int i=0;i<triangle.size();i++){
//              int minsum=Integer.MAX_VALUE;
//             for(int j=0;j<triangle.get(i).size();j++){
//                 minsum=Math.min(triangle.get(i).get(j),minsum);

//             }
//             ans=ans+minsum;
//         }
//         return ans;

        
//     }
// }









// class Solution {
//     public int minimumTotal(List<List<Integer>> tri) {
//         for (int i = tri.size() - 2; i >= 0; i--)
//             for (int j = 0; j < tri.get(i).size(); j++)
//                 tri.get(i).set(j, tri.get(i).get(j) + Math.min(
//                     tri.get(i + 1).get(j),
//                     tri.get(i + 1).get(j + 1)
//                 ));
//         return tri.get(0).get(0);
//     }
// }



class Solution {
    int m;
    Integer[][] dp;
    public int minimumTotal(List<List<Integer>> tran) {
        m = tran.size();
        dp = new Integer[m][m];
       
        return helper(tran,0,0);
    }
    int helper(List<List<Integer>> tran,int row, int col){
        if(row==m){
            return 0;
        }
        if(dp[row][col]!=null){
            return dp[row][col];
        }
        int left = helper(tran,row+1,col);
        int right = helper(tran,row+1,col+1);
        return dp[row][col]=tran.get(row).get(col) + Math.min(left,right);
    }
}