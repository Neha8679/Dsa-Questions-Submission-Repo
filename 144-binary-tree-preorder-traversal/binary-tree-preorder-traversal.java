/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
    //     List<Integer>arr=new ArrayList<>();
    //     preOrder(root,arr);
    //     return arr;
        
        
    // }
    // public void preOrder(TreeNode root,List<Integer> arr){
    //     if(root==null){
    //         return;
    //     }
    //     arr.add(root.val);
    //     preOrder(root.left,arr);
    //     preOrder(root.right,arr);



    List<Integer> preorder=new ArrayList<>();
    if(root==null){
        return preorder;
    }
    Stack<TreeNode> st=new Stack<>();
    st.push(root);

    while(!st.isEmpty()){
        root=st.pop();
        preorder.add(root.val);
        if(root.right!=null){
            st.push(root.right);
        }
        if(root.left!=null){
            st.push(root.left);
        }
    }
    return preorder;
    }
}