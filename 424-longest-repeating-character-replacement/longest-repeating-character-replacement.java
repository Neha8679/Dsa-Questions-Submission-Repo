class Solution {
    public int characterReplacement(String s, int k) {
        int n= s.length();
        int r=0;
        int l=0;
        int maxfre=0;
        int maxlen=0;
        int[] map=new int[26];
        while(r<n){
            map[s.charAt(r)-'A']++;
            maxfre=Math.max(maxfre,map[s.charAt(r)-'A']);
            if(((r-l+1)-maxfre)>k){
                map[s.charAt(l)-'A']--;
                l++;
            }
            if(((r-l+1)-maxfre)<=k){
                maxlen=Math.max(maxlen,r-l+1);


            }
            r++;
        }
        return maxlen;
        
    }
}