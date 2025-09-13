class MyQueue {

    int front, rear;
    int arr[] = new int[100005];

    MyQueue() {
        front = -1;
        rear = -1;
    }

    // Function to push an element x in a queue.
    void push(int x) {
        // Your code here
        if(rear==arr.length-1){
            return;
        }
        else if(front==-1){
            front++;
            rear++;
            arr[front]=x;
            
        }
        else{
            rear++;
            arr[rear]=x;
        }
    }

    // Function to pop an element from queue and return that element.
    int pop() {
        
        // Your code here
        if(front==-1){
            return -1;
        }
        else if(front>rear){
            return -1;
        }
        else{
            int val=arr[front];
            front++;
            return val;
        }
    }
}