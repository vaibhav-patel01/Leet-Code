class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return depth(root, 1);
    }
    private int depth(TreeNode root, int d){
        if(root == null) return d-1 ;
        if(root.left == null && root.right == null){
            return d; 
        }
        int left = depth(root.left, d+1 );
        int right = depth(root.right, d+1); 
        return Math.max(left, right);
    }
}