class Solution {
    public boolean isValid(String s) {
         Stack < Character> stack=new Stack<>();
        Map <Character,Character> bracketmap=new HashMap<>();
        bracketmap.put(')','(');
        bracketmap.put('}','{');
        bracketmap.put(']','[');
        for(char ch:s.toCharArray()){
            if(bracketmap.containsValue(ch)){
                stack.push(ch);
            }
            else if(bracketmap.containsKey(ch)){
                if(stack.isEmpty() || stack.pop()!=bracketmap.get(ch)){
                    return false;
                }
            }
            else {
                return false;
            }
        }
        return stack.isEmpty();
        
    }
}