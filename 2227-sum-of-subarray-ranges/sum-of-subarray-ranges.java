class Solution {
    public long subArrayRanges(int[] nums) {
        long smallestsum=0;
        long largestsum=0;
        Stack <Integer> stack=new Stack<>();
        int n=nums.length;
        int[] lefts=new int[n];
        int[] rights=new int[n];
        int[] leftl=new int[n];
        int[] rightl=new int[n];
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && nums[i]>=nums[stack.peek()]){
                stack.pop();
            }
            leftl[i]=stack.isEmpty()? -1:stack.peek();
            stack.push(i);

        }
        stack.clear();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && nums[i]>nums[stack.peek()]){
                stack.pop();
            }
            rightl[i]=stack.isEmpty()? n:stack.peek();
            stack.push(i);
        }
        stack.clear();
        for(int i=0;i<n;i++){
            largestsum += (long)nums[i]*(rightl[i]-i)*(i-leftl[i]);
        }
         for(int i=0;i<n;i++){
            while(!stack.isEmpty() && nums[i]<=nums[stack.peek()]){
                stack.pop();
            }
            lefts[i]=stack.isEmpty()? -1:stack.peek();
            stack.push(i);

        }
        stack.clear();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && nums[i]<nums[stack.peek()]){
                stack.pop();
            }
            rights[i]=stack.isEmpty()? n:stack.peek();
            stack.push(i);
        }
        stack.clear();
        for(int i=0;i<n;i++){
            smallestsum += (long)nums[i]*(rights[i]-i)*(i-lefts[i]);
        }
        return (largestsum-smallestsum);

        
    }
}