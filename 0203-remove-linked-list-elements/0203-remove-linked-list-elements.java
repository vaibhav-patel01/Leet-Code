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
    public ListNode removeElements(ListNode head, int val) {
        ListNode pointer = head ;
        ListNode prev = new ListNode(0); 
        ListNode prevPointer = prev; 
        while(pointer != null){
            if(pointer.val != val){
                prevPointer.next = pointer; 
                prevPointer = prevPointer.next;  
            }
            pointer = pointer.next ;
        }
        prevPointer.next = null ;
        return prev.next; 
    }
}