class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack=new Stack<>();
        int n=heights.length;
        int maxArea=0;
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && heights[i]<heights[stack.peek()]){
                
                int element=stack.peek();
                stack.pop();
                int nse=i;
                int pse=stack.isEmpty()? -1:stack.peek();
                maxArea=Math.max((heights[element]*(nse-pse-1)),maxArea);
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            int element=stack.peek();
            stack.pop();
            int nse=n;
            int pse=stack.isEmpty() ? -1:stack.peek();
            maxArea=Math.max((heights[element]*(nse-pse-1)),maxArea);

        }
        return maxArea;
        
    }
}