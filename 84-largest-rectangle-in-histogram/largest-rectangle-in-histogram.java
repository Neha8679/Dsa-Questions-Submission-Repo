class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer> s=new Stack<>();
        int maxArea=0;
        
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && heights[s.peek()]>heights[i]){
                int element=s.peek();
                s.pop();
                int nse=i;
                int pse=s.isEmpty() ? -1:s.peek();
                maxArea=Math.max(maxArea,heights[element]*(nse-pse-1));
            }
            s.push(i);
        }
        while(!s.isEmpty()){
            int nse=n;
            int element=s.peek();
            s.pop();
            int pse=s.isEmpty()?-1:s.peek();
            maxArea=Math.max(maxArea,heights[element]*(nse-pse-1));
        }
        return maxArea;
        
    }
}