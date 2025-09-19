class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] ans=new int[2*n];
        int[] newarr=new int[2*n];
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<n;i++){
            newarr[i]=nums[i];
            newarr[i+n]=nums[i];
        }
        for(int i=2*n-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=newarr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=stack.peek();
            }
            stack.push(newarr[i]);
        }
        int[] result=new int[n];

        for(int i=0;i<n;i++){
            result[i]=ans[i];
        }
        return result;
        
    }
}