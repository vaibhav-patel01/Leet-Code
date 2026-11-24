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
    int n; 
    public TreeNode sortedArrayToBST(int[] nums) {
        n = nums.length; 
        return solve(nums, 0, n-1);
    }
    private TreeNode solve(int[] nums, int i, int j){
        if(i==j){
            return new TreeNode(nums[i]);
        }
        if(j < i){
            return null;
        }
        int mid = i+ (j-i)/2; 
        TreeNode node = new TreeNode(nums[mid]);
        node.left = solve(nums, i, mid-1);
        node.right = solve(nums, mid+1, j);
        return node; 
    }
}