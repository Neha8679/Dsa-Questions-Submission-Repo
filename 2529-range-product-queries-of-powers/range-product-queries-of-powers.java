class Solution {
     static final long MOD=1_000_000_007;
    public int[] productQueries(int n, int[][] queries) {
       
   
    
        StringBuilder binary=new StringBuilder();
        int num=n;
        while(num>0){
            binary.append(num%2);
            num=num/2;
        }
        binary.reverse();
        List<Integer> power=new ArrayList<>();
        int len=binary.length();
        for(int i=0;i<len;i++){
            if(binary.charAt(len-1-i)=='1'){
                power.add(1<<i);
            }
        }
        Collections.sort(power);
        
        int q=queries.length;
        int[] ans=new int[q];
        for(int i=0;i<q;i++){
            int left=queries[i][0];
            int right=queries[i][1];
            long product=1;
            for(int j=left;j<=right;j++){
                product=(product*power.get(j))%MOD;
            }
            ans[i]=(int) product;
        }
        return ans;
 
        
    }
}