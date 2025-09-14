class MinStack {

    class Node{
        int val;
        int minval;
        Node next;
        Node(int val,int minval){
            this.val=val;
            this.minval=minval;
            this.next=null;
        }
    }
    Node head;

    public MinStack() {
        head=null;
        
    }
    
    public void push(int val) {
        int minval;
        if(head==null){
            minval=val;
        }
        else{
            minval=(val<=head.minval) ? val:head.minval;
        }
        Node newNode=new Node(val,minval);
        if(head==null){
            
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;

        }
        
    }
    
    public void pop() {
        head=head.next;
        
    }
    
    public int top() {
        return head.val;
        
    }
    
    public int getMin() {
        return head.minval;
        
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