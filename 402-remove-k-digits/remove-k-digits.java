class Solution {
    public String removeKdigits(String num, int k) {
        int n=num.length();
        Stack<Character>s=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && k>0 && (s.peek()-'0')>(num.charAt(i)-'0')){
                s.pop();
                k--;

            }
            s.push((num.charAt(i)));
        }
        while(k>0 && !s.isEmpty()){
            s.pop();
            k--;
        }
        if(s.isEmpty()){
            return "0";
        }
        
        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty()){
            sb=sb.append(s.peek());
            s.pop();
        }
        while(sb.length()>0 && sb.charAt(sb.length()-1)=='0'){
            sb.deleteCharAt(sb.length()-1);
            
        }
        sb.reverse();
        if(sb.length()==0){
            return "0";
        }
        return sb.toString();


        
    }
}