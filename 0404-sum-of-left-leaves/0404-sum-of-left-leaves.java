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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        return solve(root,0);
    }
    int solve(TreeNode root,int bool){
        if(root.left==null && root.right==null){
            if(bool==1) return root.val;
            return 0;
        }
        int right=0,left=0;
        if(root.left!=null)left=solve(root.left,1);        
        if(root.right!=null) right=solve(root.right,0);
        return left+right;
    }
}