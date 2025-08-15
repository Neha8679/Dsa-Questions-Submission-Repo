class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            int x=n%2;
            if(x==1){
                count=count+1;

            }
            n=n/2;

        }
        return count;
        
    }
}