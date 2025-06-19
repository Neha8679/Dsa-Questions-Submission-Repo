// User function Template for Java

class Solution {
    static String postToInfix(String exp) {
        // code here
        int n=exp.length();
        Stack<String>s=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=exp.charAt(i);
            if(isOperator(ch)){
                String op1=s.pop();
                String op2=s.pop();
                String temp= "(" + op2 +ch + op1 + ")";
                s.push(temp);
            }
            else{
                s.push(exp.charAt(i)+"");
            }
        }
        return s.peek();
        
    }
    static boolean isOperator(char x){
        switch(x){
            case '+':
            case '-':
            case '*':
            case '/':
                return true;
        
        }
        return false;
    }
}
