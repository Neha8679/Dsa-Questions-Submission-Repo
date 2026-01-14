class LRUCache {
    Node head=new Node(0,0);
    Node tail=new Node(0,0);
    HashMap<Integer,Node> map=new HashMap<>();
    int cap;

    public LRUCache(int capacity) {
        cap=capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        return -1;
        
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            remove(node);

        }
        if(map.size()==cap){
            remove(tail.prev);

        }
        insert(new Node(key,value));
        
    }
    private void insert(Node node){
        map.put(node.key,node);
        node.next=head.next;
        node.next.prev=node;
        head.next=node;
        node.prev=head;
    }
    private void remove(Node node){
        map.remove(node.key);
        node.next.prev=node.prev;
        node.prev.next=node.next;
    }
    class Node{
        int key;
        int value;
        Node prev;
        Node next;
        Node(int _key,int _value){
            key=_key;
            value=_value;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */