class Solution {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
        long i=0;
        while(i*i<=x){
            i++;
        }
        return (int)(i-1);
        
    }
}