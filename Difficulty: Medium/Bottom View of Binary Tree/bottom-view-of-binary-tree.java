/*
class Node
{
    int data; //data of the node
    int hd; //horizontal distance of the node
    Node left, right; //left and right references

    // Constructor of tree node
    public Node(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> bottomView(Node root) {
        // Code here
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Map<Integer,Integer> map=new TreeMap<>();
        Queue<AbstractMap.SimpleEntry<Node,Integer>> q=new LinkedList<>();
        q.add(new AbstractMap.SimpleEntry<>(root,0));
        while(!q.isEmpty()){
            AbstractMap.SimpleEntry<Node,Integer> entry=q.poll();
            Node node=entry.getKey();
            int line=entry.getValue();
            map.put(line,node.data);
            if(node.left!=null){
                q.add(new AbstractMap.SimpleEntry<>(node.left,line-1));
            }
            if(node.right!=null){
                q.add(new AbstractMap.SimpleEntry<>(node.right,line+1));
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            ans.add(entry.getValue());
            
        }
        return ans;
    }
}