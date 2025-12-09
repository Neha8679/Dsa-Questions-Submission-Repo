class Solution {
    public String truncateSentence(String s, int k) {
        int n=s.length();
        int cnt=0;
        String ans="";
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch==' '){
                cnt++;
            }
            if(cnt==k){
                return ans;
            }
            ans=ans+ch;
        }
        return ans;
        
        
    }
}