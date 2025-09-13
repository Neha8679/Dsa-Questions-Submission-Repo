class MyStack {
    int top;
    int cap;
    int[] arr;
    public MyStack(){
        this.cap=100;
        top=-1;
        arr=new int[cap];
        
    }
    
    
    

    public void push(int x) {
        if(top==cap-1){
            return;
        }
        else{
            top++;
            arr[top]=x;
        }
        
     
    }

    public int pop() {
        
        // code here
        if(top<0){
            return -1;
            
        }
        else{
            int val=arr[top];
            top--;
            return val;
            
            
            
        }
    }
}
