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
    List<Integer> list; 
    public List<Integer> postorderTraversal(TreeNode root) {
        list  =  new ArrayList<>();
        solve(root);
        return list ;
    }
    private void solve(TreeNode node){
        if(node == null){
            return ; 
        }
        solve(node.left);
        solve(node.right);
        list.add(node.val);
    }
}