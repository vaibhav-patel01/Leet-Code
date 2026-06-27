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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode middle  = slow;
        ListNode start = middle.next;
        middle.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(start);

        return merge(left,right);
 

    }
    private ListNode merge(ListNode head1, ListNode head2){
        ListNode temp = new ListNode();
        ListNode pointer =  temp;
        while(head1 != null && head2 != null){
            if(head1.val <= head2.val){
                pointer.next = head1;
                head1 = head1.next;
                pointer = pointer.next;
            }
            else {
                pointer.next = head2;
                head2 = head2.next;
                pointer = pointer.next;
            }
        }
        while(head1 != null){
            pointer.next = head1;
                head1 = head1.next;
                pointer = pointer.next;
        }
        while(head2 != null){
            pointer.next = head2;
                head2 = head2.next;
                pointer = pointer.next;
        }
        return temp.next;
    }
}