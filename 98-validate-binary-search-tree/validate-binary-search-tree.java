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
// class Solution {
//     List<Integer>list=new ArrayList<>();
//     public boolean isValidBST(TreeNode root) {
//         inorder(root);
//         int n=list.size();
//         for(int i=0;i<n-1;i++){
//             if(list.get(i)>=list.get(i+1)){
//                 return false;

//             }
//         }
//         return true;
        
//     }
//     public void inorder(TreeNode root){
//         if(root==null){
//             return ;
//         }
//         inorder(root.left);
//         list.add(root.val);
//         inorder(root.right);
//     }
// }

class Solution {
    private TreeNode prev;

    public boolean isValidBST(TreeNode root) {
        prev = null;
        return inorder(root);
    }

    private boolean inorder(TreeNode node) {
        if (node == null) return true;

        if (!inorder(node.left)) return false;

        if ((prev != null) && (node.val <= prev.val)) return false;
        prev = node;
        
        return inorder(node.right);
    }
}