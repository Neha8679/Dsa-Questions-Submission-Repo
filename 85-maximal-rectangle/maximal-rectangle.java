class Solution {
    public int maximalRectangle(char[][] matrix) {
        int rows=matrix.length;
        int col=matrix[0].length;
        int maxarea=0;
        int[][] prefixsum=new int[rows][col];
        for(int i=0;i<col;i++){
            int sum=0;
            for(int j=0;j<rows;j++){
                
                
                if(matrix[j][i]=='0'){
                    sum=0;
                }
                else{
                    sum+=1;
                }
                prefixsum[j][i]=sum;
            }

        }
        for(int i=0;i<rows;i++){
            maxarea=Math.max(maxarea,histogram(prefixsum[i]));
        }
        return maxarea;
        
    }
    public int histogram(int[] prefixsum ){
        Stack<Integer> stack = new Stack<>();
        int maxarea = 0;
        int n = prefixsum.length;

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prefixsum[i] < prefixsum[stack.peek()]) {
                int height = prefixsum[stack.pop()];
                int width = stack.isEmpty() ? i : (i - stack.peek() - 1);
                maxarea = Math.max(maxarea, height * width);
            }
            stack.push(i);
        }

        // Handle remaining bars in stack
        while (!stack.isEmpty()) {
            int height =prefixsum[stack.pop()];
            int width = stack.isEmpty() ? n : (n - stack.peek() - 1);
            maxarea = Math.max(maxarea, height * width);
        }

        return maxarea;
    }
}