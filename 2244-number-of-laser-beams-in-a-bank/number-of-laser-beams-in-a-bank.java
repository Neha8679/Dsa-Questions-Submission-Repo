class Solution {
    public int numberOfBeams(String[] bank) {
        int n=bank.length;
        int[] arr=new int[n];
         int sum=0;

        for(int i=0;i<n;i++){
            String s=bank[i];
            int m=s.length();
            int cnt=0;
            for(int j=0;j<m;j++){
                int ch=s.charAt(j)-'0';
                if(ch==1){
                    cnt++;
                }

            }
            arr[i]=cnt;

        }
       
        int k=0;
        while(k<n){
            for(int j=k+1;j<n;j++){
                if(arr[j]!=0){
                    sum=sum+(arr[k]*arr[j]);
                    break;
                }

            }
            k++;
        }
        return sum;
        
    }
}