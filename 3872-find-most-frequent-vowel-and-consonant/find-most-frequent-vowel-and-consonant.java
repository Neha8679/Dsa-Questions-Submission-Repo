class Solution {
    public int maxFreqSum(String s) {
        int n=s.length();
        int[] freq=new int[26];
        int maxcon=0;
        int maxvol=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int j=ch-'a';
            freq[j]++;
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                maxvol=Math.max(maxvol,freq[j]);
            }
            else{
                maxcon=Math.max(maxcon,freq[j]);
            }


        }
        return maxcon+maxvol;

        
    }
}