// User function Template for Java

class Solution {
    static String postToPre(String post_exp) {
        // code here
        Stack <String> stack=new Stack<>();
        int n=post_exp.length();
        for(int i=0;i<n;i++){
            char ch=post_exp.charAt(i);
            if(isOperator(ch)){
                String op1=stack.pop();
              
                String op2=stack.pop();
                
                String temp=ch + op2 + op1;
                stack.push(temp);
            }
            else{
                stack.push(post_exp.charAt(i) + "");
            }
            
           
            
        }
        String ans="";
            for(String s:stack){
                ans+=s;
            }
        return ans;
        
    }
    static boolean isOperator( char x){
        switch(x){
            case '+':
            case '-':
            case '/':
            case '*':
                return true;
        }
        return false;
    }
}
