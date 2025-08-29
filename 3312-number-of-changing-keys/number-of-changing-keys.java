class Solution {
    public int countKeyChanges(String s) {
        int n= s.length();
        s=s.toLowerCase();
        int cnt=0;
        for(int i=0;i<n-1;i++){
            char ch1=s.charAt(i);
            char ch2=s.charAt(i+1);
            if(ch1!=ch2){
                cnt++;
            }



        }
        return cnt;

        
    }
}