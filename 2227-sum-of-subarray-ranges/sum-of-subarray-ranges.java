class Solution {
    public long subArrayRanges(int[] nums) {
        int n=nums.length;
        long largestsum=0;
        long smallestsum=0;
        int[] psee=new int[n];
        int[] nse=new int[n];
        int[] pgee=new int[n];
        int[] nge=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && nums[s.peek()]>=nums[i]){
                s.pop();
            }
            psee[i]=s.isEmpty() ? -1:s.peek();
            s.push(i);

        }
        s.clear();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && nums[s.peek()]>nums[i]){
                s.pop();
            }
            nse[i]=s.isEmpty()?n:s.peek();
            s.push(i);
        }
        s.clear();
        for(int i=0;i<n;i++){
            smallestsum +=(long)(i-psee[i]) *( nse[i] -i)* nums[i];
        }
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && nums[s.peek()]<=nums[i]){
                s.pop();
            }
            pgee[i]=s.isEmpty()?-1:s.peek();
            s.push(i);
        }
        s.clear();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && nums[s.peek()]<nums[i]){
                s.pop();
            }
            nge[i]=s.isEmpty() ? n: s.peek();
            s.push(i);

        }
        s.clear();
        for(int i=0;i<n;i++){
            largestsum +=(long)(i-pgee[i]) *(nge[i]-i) * nums[i];
        }
        return (largestsum - smallestsum);

        
    }
}