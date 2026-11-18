class Solution {
    public boolean isSymmetric(TreeNode root) {
        return solve(root.left, root.right);
    }
    private boolean solve(TreeNode node1, TreeNode node2){
        if(node1 == null && node2 == null){
            return true;
        }
        if(node1 == null || node2 == null) return false;
        if(node1.val != node2.val){
            return false;
        }

        return solve(node1.left , node2.right) && solve(node1.right , node2.left);
    }
}