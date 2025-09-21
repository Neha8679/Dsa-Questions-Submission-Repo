class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] psum=new int[n][m];
        int maxArea=0;
        for(int j=0;j<m;j++){
            int sum=0;
            for(int i=0;i<n;i++){
                
                if(matrix[i][j]=='0'){
                    sum=0;
                }
                else{
                    sum+=1;
                }
                psum[i][j]=sum;
            }
        }
        for(int i=0;i<n;i++){
            maxArea=Math.max(maxArea,lhist(psum[i]));
        }
        return maxArea;
        
    }
    public int lhist(int[] psum){
        int n=psum.length;
        Stack<Integer> s=new Stack<>();
        int maxarea=0;
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && psum[s.peek()]>psum[i]){
                int nse=i;
                int element=s.peek();
                s.pop();
                int pse=s.isEmpty()?-1:s.peek();
                maxarea=Math.max(maxarea,psum[element]*(nse-pse-1));
                
            }
            s.push(i);
            
        }
        while(!s.isEmpty()){
                int nse=n;
                int element=s.peek();
                s.pop();
                int pse=s.isEmpty() ?-1: s.peek();
                maxarea=Math.max(maxarea,psum[element]*(nse-pse-1));
            }
            return maxarea;
    }
}