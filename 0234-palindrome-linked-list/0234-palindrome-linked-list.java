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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null ) return true;
        ListNode list = null;
        ListNode start = head;
        ListNode curr = head;
        while(start != null){
            ListNode temp = new ListNode(start.val);
            temp.next = list;
            list = temp;
            start = start.next;
        }
        while(curr != null){
            if(curr.val != list.val) return false;
            curr = curr.next;
            list = list.next;
        }
        return true;
    }
    
}