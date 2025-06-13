class Solution {
    public static String infixToPostfix(String s) {
        // code here
        int n=s.length();
        Stack<Character> stack=new Stack<>();
        String ans=new String("");
        int i=0;
        while(i<n){
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                ans=ans+c;
            }
            else if(c=='('){
                stack.push(c);
            }
            else if(c==')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    ans=ans+stack.pop();
                }
                if(!stack.isEmpty() && stack.peek()=='('){
                    stack.pop();
                }
                
            }
            else{
                while(!stack.isEmpty() && prec(c) <= prec(stack.peek()) && stack.peek()!='(' ){
                    ans=ans+stack.pop();
                    
                    
                }
                stack.push(c);
            }
            i++;
        }
        while(!stack.isEmpty()){
            ans=ans+stack.pop();
        }
        return ans;
    }
    private static int prec(char c){
        switch(c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
}