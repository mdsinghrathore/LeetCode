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
        int ans =0;
        ans=depth(root,ans);
        return ans;
    }
    private int  depth(TreeNode root , int ans){
        if(root==null){
            return ans;
        }
        int a=depth(root.left,ans++);
        int b=depth(root.right,ans++);
        return Math.max(a+1,b);
    }
}