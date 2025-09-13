/*
class QueueNode
{
    int data;
    QueueNode next;
    QueueNode(int a)
    {
        data = a;
        next = null;
    }
}
*/

class MyQueue {
    QueueNode front, rear;

    // Function to push an element into the queue.
    void push(int a) {
        // code here
        QueueNode node=new QueueNode(a);
        if(front==null){
           
            front =node;
            rear=node;
            
        }
        else{
            rear.next=node;
            rear=node;
            
            
        }
    }

    // Function to pop front element from the queue
    int pop() {

        
        // code here
        if(front==null){
            return -1;
        }
        else{
            int val=front.data;
            QueueNode temp=front;
            front=front.next;
            return val;
        }
    }
}