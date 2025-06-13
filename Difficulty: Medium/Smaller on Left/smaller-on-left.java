class Solution {
    public int[] leftSmaller(int[] arr) {
        // code here
        int n=arr.length;
        int[] pse=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[i]<=stack.peek()){
                stack.pop();
            }
            pse[i]=stack.empty() ? -1:stack.peek();
            stack.push(arr[i]);
        }
        return pse;
    }
}
