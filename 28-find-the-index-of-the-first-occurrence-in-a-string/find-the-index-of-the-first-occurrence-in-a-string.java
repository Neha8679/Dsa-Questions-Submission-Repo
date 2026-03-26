class Solution {
    public int strStr(String haystack, String needle) {
        int m=haystack.length();
        int n=needle.length();
        if(n>m){
            return -1;
        }
        for(int i=0;i<=m-n;i++){
            int k=0;
            for(int j=0;j<n;j++){
                if(haystack.charAt(j+i)-'0'==needle.charAt(j)-'0'){
                    k++;
                }
            }
            if(k==n){
                return i;
            }

        }
        return -1;
        
    }
}