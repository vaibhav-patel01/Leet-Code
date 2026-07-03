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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode i = head;

        ListNode first = head;
        ListNode fh = first;
        ListNode part2 = head.next;
        ListNode second = part2;
        int size = 1;

        while( i != null){
            if(size % 2 != 0 && size > 1){
                first.next = i;
                first = first.next;
            }
            else if(size % 2 == 0 && size > 2){
                second.next = i;
                second = second.next;
            }
            i = i.next;
            size++;
        }
        second.next = null;
        first.next = part2;
        return fh;
    }
}