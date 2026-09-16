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
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for (int val : nums){
            set.add(val);
        }
        ListNode curr = head;
        ListNode result = new ListNode();
        ListNode i = result;
        while(curr != null){
            if(!set.contains(curr.val)){
                i.next = curr; 
                i = i.next;
            }
            curr = curr.next;
        }
        i.next = null;
        return result.next;
    }
}