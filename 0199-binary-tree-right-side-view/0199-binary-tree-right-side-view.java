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
    private List<Integer> list ; 
    public List<Integer> rightSideView(TreeNode root) {
        list = new ArrayList<>();
        solve(root, 1); 
        return list;
    }
    private void solve(TreeNode node,int currLevel){
        if(node == null){
            return ; 
        }
        if(currLevel > list.size()){
            list.add(node.val);
        }
        solve(node.right,currLevel+1);
        solve(node.left, currLevel +1);
        return ;
    }
}