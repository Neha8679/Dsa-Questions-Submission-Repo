class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public MyQueue() {
        s1=new Stack<>();
        s2=new Stack<>();
        
    }
    
    public void push(int x) {
        if(!s1.isEmpty()){
            int s=s1.size();
            for(int i=0;i<s;i++){
                s2.push(s1.peek());
                s1.pop();
            }

        }
        s1.push(x);
        int s=s2.size();
        for(int i=0;i<s;i++){
            s1.push(s2.peek());
            s2.pop();
        }
        
    }
    
    public int pop() {
        return s1.pop();
        
    }
    
    public int peek() {
        return s1.peek();
        
    }
    
    public boolean empty() {
        return s1.isEmpty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */