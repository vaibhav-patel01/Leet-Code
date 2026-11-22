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
class Pair {
    TreeNode node;
    int idx;
    Pair(TreeNode node, int idx) {
        this.node = node;
        this.idx = idx;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        int max = 1;
        Deque<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(root, 0));
        while(!queue.isEmpty()){
            int size = queue.size();
            int first = queue.peekFirst().idx; 
            int last = queue.peekLast().idx;
            max = Math.max(last-first+1, max);
            while(size != 0){
                Pair temp = queue.remove();
                if(temp.node.left != null){
                    queue.add(new Pair(temp.node.left, temp.idx*2+1));
                }
                if(temp.node.right != null){
                    queue.add(new Pair(temp.node.right, temp.idx*2+2));
                }
                size--;
            }
        }
        return max; 
    }
}