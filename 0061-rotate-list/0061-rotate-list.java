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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode curr = head;
        ListNode curr3 = head;

        int size = 0;
        while(curr != null){
            size++ ; 
            curr = curr.next;
        }
        k %= size;
        if(k==0 || k==size) return head;


        for(int i = 1 ; i < size-k ; i++){
            curr3 = curr3.next ; 
        }
        ListNode temp = curr3.next ; 
        ListNode hh  = temp;
        curr3.next = null;

        while(temp.next != null){
            temp = temp.next ; 
        }
        temp.next = head;
        return hh;
    }
}