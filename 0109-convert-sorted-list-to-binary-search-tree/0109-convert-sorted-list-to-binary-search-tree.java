/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        ListNode curr = head; 
        List<Integer> list = new ArrayList<>();
        while(curr != null){
            list.add(curr.val);
            curr = curr.next;
        }
        return solve(list, 0, list.size()-1); 
    }
    private TreeNode solve(List<Integer> list, int i, int j){
        if(i==j){
            return new TreeNode(list.get(i));
        }
        if(j < i){
            return null;
        }
        int mid = i+ (j-i)/2; 
        TreeNode node = new TreeNode(list.get(mid));
        node.left = solve(list, i, mid-1);
        node.right = solve(list, mid+1, j);
        return node; 
    }
}