class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<2*n;i++){
            int currentindex=i%n;
            while(!stack.isEmpty() && nums[stack.peek()]<nums[currentindex]){
                result[stack.pop()]=nums[currentindex];
            }
            if(i<n){
                stack.push(currentindex);
            }
        }
        while(!stack.isEmpty()){
            result[stack.pop()]=-1;
        }
        return result;

        
    }
}