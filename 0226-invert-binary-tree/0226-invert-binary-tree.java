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
    public TreeNode invertTree(TreeNode root) {
        reverse(root);
        return root;
    }
    private void reverse(TreeNode root){
        if(root==null){
            return;
        }
        TreeNode a=null;
        TreeNode b = null;
        if(root.left!=null){
             a = root.left;
        }
        if(root.right!=null){
             b = root.right;
        }
        root.left=b;
        root.right=a;
        reverse(root.left);
        reverse(root.right);
    }
}