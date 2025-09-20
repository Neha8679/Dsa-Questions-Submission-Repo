class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        Stack<Integer>s=new Stack<>();
        
        for(int i=0;i<n;i++){
            if(asteroids[i]>0){
                s.push(asteroids[i]);
            }
            else{
                while(!s.isEmpty() && Math.abs(asteroids[i])>s.peek() &&s.peek()>0){
                    s.pop();
                }
                if(!s.isEmpty() && s.peek()==Math.abs(asteroids[i])){
                    s.pop();
                }
                else if(s.isEmpty() || s.peek()<0){
                    s.push(asteroids[i]);

                }
                
            }
        }
        int[] ans=new int[s.size()];
        for(int i=s.size()-1;i>=0;i--){
            ans[i]=s.peek();
            s.pop();
        }
        return ans;
        
    }
}