class Solution {
    public int sumSubarrayMins(int[] arr) {
        int[] nse=findnse(arr);
        int[] psee=findpsee(arr);
        long total=0;
        int left=0;
        int right=0;
        int n=arr.length;
        long mod=1000000007L;
        for(int i=0;i<n;i++){
            left=i-psee[i];
            right=nse[i]-i;
            total=(total +((long)left*right *arr[i])%mod)%mod;

        }
        return (int)total;

        
    }
    public int[] findnse(int[] arr){
        int n=arr.length;
        int[] nse=new int[n];
        Stack<Integer>stack=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            nse[i]=stack.isEmpty() ? n:stack.peek();
            stack.push(i);

        }
        return nse;
    }
    public int[] findpsee(int[] arr){
        int n=arr.length;
        int[] psee=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                stack.pop();
            }
            psee[i]=stack.isEmpty() ? -1:stack.peek();
            stack.push(i);
        }
        return psee;
    }
}