/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

// class Solution {
//     public Node connect(Node root) {
//         if(root == null) return null;
//         Queue<Node> q = new LinkedList<>();
//         q.offer(root);
//         while(!q.isEmpty()) {
//             Node rightNode = null;
//             for(int i = q.size(); i > 0; i--) {
//                 Node cur = q.poll();
//                 cur.next = rightNode;
//                 rightNode = cur;
//                 if(cur.right != null) {
//                     q.offer(cur.right);
//                     q.offer(cur.left);
//                 }
//             }
//         }
//         return root;        
//     }
// }





class Solution {
    public Node connect(Node root) {
        if (root == null) return null;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            Node prev = null;

            for (int i = 0; i < size; i++) {
                Node node = q.poll();

                if (prev != null) {
                    prev.next = node;
                }
                prev = node;

                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            // last node in the level will have next = null automatically
        }
        return root;
    }
}
