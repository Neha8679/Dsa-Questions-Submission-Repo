class Solution {
    public int minDeletionSize(String[] strs) {
        int m=strs.length;
        int n=strs[0].length();
        String[] arr=new String[n];
        String s1="";
        
        for(int i=0;i<n;i++){
             s1="";
            for(int j=0;j<m;j++){
                String s=strs[j];
                 s1=s1+s.charAt(i);

            }
            arr[i]=s1;

        }
        int k=arr.length;
        int cnt=0;
        int l=arr[0].length();
        for(int i=0;i<k;i++){
            for(int j=0;j<l-1;j++){
                String s2=arr[i];
                if(s2.charAt(j)>s2.charAt(j+1)){
                    cnt++;
                    break;

                }

            }
        }
        return cnt;
        
    }
}