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
    public int maxDepth(TreeNode root) {
        // List<List<Integer>> ans=new ArrayList<>();
        // if(root==null){
        //     return 0;

        // }
        // Queue<TreeNode> q=new LinkedList<>();
        // q.add(root);
        // while(!q.isEmpty()){
        //     int n=q.size();
        //     List<Integer> arr=new ArrayList<>();
        //     for(int i=0;i<n;i++){
        //         TreeNode node=q.poll();
        //         arr.add(node.val);
        //         if(node.left!=null){
        //             q.add(node.left);

        //         }
        //         if(node.right!=null){
        //             q.add(node.right);
        //         }
        //     }
        //     ans.add(arr);
        // }
        // int x=ans.size();
        // return x;
         

         
        if(root==null) return 0;
        int l=maxDepth(root.left);
        int r=maxDepth(root.right);
        return 1+Math.max(l,r);
    
    }
}