class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int n=apple.length;
        int m=capacity.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+apple[i];
        }
        Arrays.sort(capacity);
        int cnt=0;
        for(int i=m-1;i>=0 && sum>0;i--){
            sum-=capacity[i];
           cnt++;
        }
        return cnt;
    }
}