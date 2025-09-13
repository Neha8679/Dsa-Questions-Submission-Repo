class MyStack {
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }
    StackNode top;

    // Function to push an integer into the stack.
    void push(int a) {
        // Add your code here
        StackNode node=new StackNode(a);
        node.next=top;
        top=node;
        
    }

    // Function to remove an item from top of the stack.
    int pop() {
        // Add your code her
        if(top==null){
            return -1;
        }
        int val=top.data;
        StackNode temp=top;
        top=top.next;
        
        return val;
        
    }
}