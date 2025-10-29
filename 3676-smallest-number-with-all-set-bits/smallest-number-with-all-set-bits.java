class Solution {
    public int smallestNumber(int n) {
        String s="";
        while(n!=0){
            int x=n%2;
             s=s+x;
            n=n/2;
        }
        int m=s.length();
        
        int z=0;
        for(int j=0;j<m;j++){
            z=z+(int)Math.pow(2,j);

        }
        return z;



        
    }
}