class Solution {
    public boolean checkValidString(String s) {
        // int n=s.length();
        // int l=0;
        // int sign=0;
        // int r=0;
        // for(int i=0;i<n;i++){
        //     char ch=s.charAt(i);
        //     if(ch=='('){
        //         l++;
        //     }
        //     else if(ch==')'){
        //         r++;
        //     }
        //     else{
        //         sign++;
        //     }


        // }
        // if(l==r){
        //     return true;
        // }
        // else if(l!=r && (r-l)==sign){
        //     return true;


        // }
        // return false;

        int min_open=0;
        int max_open=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                min_open++;
                max_open++;
            }
            else if(ch==')'){
                min_open=Math.max(min_open-1,0);
                max_open--;
            }
            else if(ch=='*'){
               if( min_open>0){
                min_open--;
               }
               max_open++;
            }
            if(max_open<0){
                return false;

            }
        }
        return min_open==0;
    
        
    }
}