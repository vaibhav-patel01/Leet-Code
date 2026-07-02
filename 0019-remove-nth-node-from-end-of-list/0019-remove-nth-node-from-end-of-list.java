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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null ) return null;
        ListNode i = head;
        ListNode j = head;;
        int size = 0;
        while(j != null){
            size++;
            j = j.next ;
        }
        if(size == n) return head.next;
        for (int k = 1 ; k < size - n ;k++){
            i = i.next;
        }
        i.next = i.next.next;
        return head;
    }
}