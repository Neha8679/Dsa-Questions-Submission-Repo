class Solution {
    public String makeGood(String s) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i)-'0';
            if(st.isEmpty()){
                st.push(ch);
            }
            else if(st.peek()==ch+32 || st.peek()==ch-32){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        int z=st.size();
        char[] arr=new char[z];
        for(int i=z-1;i>=0;i--){
            char ch2=(char)(st.pop()+'0');
            arr[i]=ch2;
        }
        int k=arr.length;
        String ans="";
        for(int i=0;i<k;i++){
            ans=ans+arr[i];
        }
        return ans;
        
    }
}