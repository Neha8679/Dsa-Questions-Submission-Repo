class Solution {
    public boolean backspaceCompare(String s, String t) {
        int n=s.length();
        int m=t.length();
        StringBuilder s1=new  StringBuilder();
        StringBuilder s2=new StringBuilder();
        for(int i=0;i<n;i++){
          
            if(s.charAt(i)=='#'){
                if(s1.length()>0){
                s1.deleteCharAt(s1.length()-1);
                }

            }
            else{
                s1.append(s.charAt(i));
            }

        }
for(int i=0;i<m;i++){

            if(t.charAt(i)=='#'){
                if(s2.length()>0){
                s2.deleteCharAt(s2.length()-1);
                }

            }
            else{
                s2.append(t.charAt(i));
            }

        }
        int k=s1.length();
        int l=s2.length();
        if(k!=l){
            return false;

        }
        for(int i=0;i<k;i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        return true;

    }
}