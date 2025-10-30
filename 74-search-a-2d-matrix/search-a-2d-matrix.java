class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // int m=matrix.length;
        // int n=matrix[0].length;
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(target>=matrix[i][j]&& target<=matrix[i][j]){
        //             int low=0;
        //             int high=n-1;

        //             while(low<=high){
        //                 int mid=(low+high)/2;
        //                 if(matrix[i][mid]==target){
        //                     return true;
        //                 }
        //                 else if(target>matrix[i][mid]){
        //                     low=low+1;
        //                 }
        //                 else{
        //                     high=high-1;
        //                 }
        //             }
        //             break;
        //         }
        //         else {
        //             continue;
        //         }
        //     }
        // }
        // return false;






        int m=matrix.length;
        int n=matrix[0].length;
        int low=0;
        int high=(m*n)-1;
        while(low<=high){
            int mid=(low+high)/2;
            int row=mid/n;
            int col=mid%n;
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                low=mid+1;
            }
            else{
            high=mid-1;
            }
        }
        return false;

        
    }
}