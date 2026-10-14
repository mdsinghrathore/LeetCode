class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return check(root, targetSum, 0);
    }
    private boolean check(TreeNode root, int targetSum, int sum) {
        if (root == null) {
            return false;
        }
        sum += root.val;
        if (root.left == null && root.right == null) {
            return sum == targetSum;
        }

        return    check(root.left, targetSum, sum)||
        check(root.right, targetSum, sum);
    }
}
