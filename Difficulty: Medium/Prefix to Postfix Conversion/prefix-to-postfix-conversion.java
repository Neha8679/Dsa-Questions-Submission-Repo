// User function Template for Java

class Solution {
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
    static String preToPost(String pre_exp) {
        // code here
        Stack<String> stack=new Stack<>();
        int n=pre_exp.length();
        for(int i=n-1;i>=0;i--){
            char c=pre_exp.charAt(i);
            if(isOperator(c)){
                String op1=stack.pop();
                String op2=stack.pop();
                String temp=op1 + op2 + c;
                stack.push(temp);
            }
            else{
                stack.push(c + "");
            }
        }
        return stack.pop();
        
    }
}
