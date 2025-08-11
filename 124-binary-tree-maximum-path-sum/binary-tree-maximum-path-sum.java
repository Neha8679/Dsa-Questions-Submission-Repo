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
    private int max;
    public int maxPathSum(TreeNode root) {
         max=Integer.MIN_VALUE;
        maxsum(root);
        return max;

        
    }
    public int maxsum(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftsum=Math.max(0,maxsum(root.left));
        int rightsum=Math.max(0,maxsum(root.right));
        max=Math.max(max,leftsum+rightsum+root.val);
        return root.val + Math.max(leftsum,rightsum);
    } 
}