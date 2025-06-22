class Solution {
    public int numberOfSubstrings(String s) {
        int[] lastseen=new int[]{-1,-1,-1};
        
        int count=0;
        int n= s.length();
        for(int i=0;i<n;i++){
            lastseen[s.charAt(i)-'a']=i;
            if(lastseen[0]!=-1 && lastseen[1]!=-1 && lastseen[2]!=-1){
                count=count+1+Math.min(lastseen[0],Math.min(lastseen[1],lastseen[2]));
            }
        }
        return count;
    }
}