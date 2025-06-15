// User function Template for Java

class Solution {
    static boolean isOperator(char x){
        switch(x){
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
            case '%':
                return true;
        }
        return false;
    }
    static String preToInfix(String pre_exp) {
        // code here
        
        int n=pre_exp.length();
        Stack<String> stack=new Stack<>();
        for(int i=n-1;i>=0;i--){
            char c=pre_exp.charAt(i);
            if(isOperator(c)){
                String op1=stack.pop();
                String op2=stack.pop();
                String temp="(" + op1 + c + op2 + ")";
                stack.push(temp);
            }
            else{
                stack.push(c + "");
            }
        }
        return stack.pop();
    }
    
}
