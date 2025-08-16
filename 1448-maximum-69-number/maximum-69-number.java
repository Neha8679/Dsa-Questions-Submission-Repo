class Solution {
    public int maximum69Number (int num) {
        char[] ans=String.valueOf(num).toCharArray();
        int n=ans.length;
        for(int i=0;i<n;i++){
            if(ans[i]=='6'){
                ans[i]='9';
                break;
            }
        }
        return Integer.parseInt(new String(ans));
        
    }
}