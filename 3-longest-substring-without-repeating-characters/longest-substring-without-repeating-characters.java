class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int maxlen=0;
        // int n=s.length();
        // for(int i=0;i<n;i++){
        //     int[] hash=new int[256];
        //     for(int j=i;j<n;j++){
        //         int val=s.charAt(j);
        //         if(hash[val]==1){
        //             break;

        //         }
        //         int length=j-i+1;
        //         maxlen=Math.max(length,maxlen);
        //         hash[val]=1;
        //     }
        // }
        // return maxlen;
        

        int n=s.length();
        int l=0;
        int r=0;
        int[] hash=new int[256];
        Arrays.fill(hash,-1);
        int maxlen=0;
        while(r<n){
            int val=s.charAt(r);
            if(hash[val]!=-1){
                if(hash[val]>=l){
                    l=hash[val]+1;
                }

            }
            int len=r-l+1;
            maxlen=Math.max(maxlen,len);
            hash[val]=r;
            r++;
        }
        return maxlen;
    }
}