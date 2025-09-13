class Solution {
    public boolean isValid(String s) {
        // Stack<Character> stack=new Stack<>();
        // int n=s.length();
        // if(n%2!=0){
        //     return false;
        // }
        // for(int i=0;i<n;i++){
        //     char ch=s.charAt(i);
            
        //     if(ch=='(' || ch== '[' || ch=='{'){
        //         stack.push(ch);
        //     }else{
        //     if(stack.isEmpty()){
        //         return false;
        //     }
        //     else if(ch==')' && stack.peek()=='('){
        //         stack.pop();
        //     }
        //     else if(ch=='}' && stack.peek()== '{'){
        //         stack.pop();
        //     }
        //     else if(ch==']' && stack.peek()=='['){
        //         stack.pop();
        //     }
        //     else{
        //         return false;
        //     }
        //     }

        // }
        
        // return stack.isEmpty();
        

        int n=s.length();
        if(n%2!=0){
            return false;
        }
        int[] stack=new int[n];
        int cnt=0;
        for(char ch:s.toCharArray()){
            switch(ch){
                case '(':
                case '{':
                case '[':
                stack[cnt++]=ch;
                break;
                case ')':
                if(cnt==0 || stack[--cnt]!='('){
                    return false;
                }
                break;
                case '}':
                if(cnt==0 || stack[--cnt]!='{'){
                    return false;
                }
                break;
                case ']':
                if(cnt==0 || stack[--cnt]!='['){
                    return false;
                }
                break;
            }
        }
        return cnt==0;
    }
}