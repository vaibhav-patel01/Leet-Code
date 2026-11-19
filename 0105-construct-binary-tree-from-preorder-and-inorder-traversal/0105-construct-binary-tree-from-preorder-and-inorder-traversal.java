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
    Map<Integer, Integer> map; 
    int idx; 
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        int n = preorder.length;
        for(int i = 0; i<n;i++){
            map.put(inorder[i], i);
        }
        idx = 0;
        return solve(preorder, inorder, 0, n-1 );
    }
    private TreeNode solve(int[] pre, int[] in, int i, int j){
        if(j < i){
            return null;
        }
        TreeNode node = new TreeNode(pre[idx]);
        int inIndex = map.get(pre[idx]);
        idx++; 
        node.left =  solve(pre,in ,i, inIndex-1);
        node.right = solve(pre, in, inIndex+1, j);
        return node ; 
    }
}