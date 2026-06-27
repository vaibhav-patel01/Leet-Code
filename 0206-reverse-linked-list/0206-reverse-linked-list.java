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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode previous = null;
        ListNode headPointer = head;
        while(headPointer != null){
           ListNode temp =  headPointer.next;
           headPointer.next = previous;
           previous = headPointer;
           headPointer = temp;

        }
        return previous;


    }
}