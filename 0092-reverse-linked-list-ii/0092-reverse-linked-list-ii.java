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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null || left == right) return head;
        ListNode curr = head;
        ListNode i = null; 
        ListNode j = null ; 
        ListNode k = head;
        for(int pos = 1 ; pos <= right ;pos++ ){
            if(pos == left - 1) k = curr;
            if(pos == left){
                i = curr;
            }
            if(pos == right) {j = curr;
                break;
            }
            curr = curr.next;
        }
        ListNode nextToRight = j.next;
        ListNode rev = reverse(i, nextToRight);
        if(left == 1) head = rev;
        else
        k.next = rev;
        i.next = nextToRight;

        return head;
    }
    private ListNode reverse(ListNode start, ListNode end){
        ListNode prev = null;
        ListNode curr = start;
        while(curr != end){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}