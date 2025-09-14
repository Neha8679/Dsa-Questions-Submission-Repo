class MinStack {
    // public Stack<Integer> stack;
    // public Stack<Integer> stack2;

    public Stack<Integer> stack;
    public Stack<Integer> minStack;

    public MinStack() {
        // stack=new Stack<>();
        // stack2=new Stack<>();
        stack=new Stack<>();
        minStack=new Stack<>();
        
        
        
    }
    
    public void push(int val) {
        // if(stack.isEmpty()){
        //     stack.push(val);
        // }
        // else{
        //     if(stack.peek()<val){
        //         int x=stack.pop();
            
        //         stack.push(val);
        //         stack.push(x);
        //     }
        //     else{
        //         stack.push(val);
        //     }
        // }
        stack.push(val);
        if(minStack.isEmpty() || val<=minStack.peek()){
            minStack.push(val);
        }
        
        
    }
    
    public void pop() {
        // stack.pop();
        int x=stack.pop();
        if(x==minStack.peek()){
            minStack.pop();
        }
        
    }
    
    public int top() {
    //   int n=stack.size();
    //   for(int i=0;i<n;i++){
    //     stack2.push(stack.peek());
    //     stack.pop();

    //   }
    //   return stack2.peek();
    if(stack.isEmpty()){
        return -1;
    }
    return stack.peek();
        
    }
    
    public int getMin() {
    //     int n=stack2.size();
    //   for(int i=0;i<n;i++){
    //     stack.push(stack2.peek());
    //     stack2.pop();
    if(minStack.isEmpty()){
        return -1;
    }
    return minStack.peek();

     }
    

        
    }


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */