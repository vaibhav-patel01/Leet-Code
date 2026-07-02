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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode i = l1;
        ListNode j = l2;
        ListNode list = new ListNode(0);
        ListNode tail = list;
        int carry = 0;
        int temp = 0;
        while( i != null || j != null){
            if( j == null){
                temp = i.val + carry;
                i = i.next;
            }
            else if(i == null){
                temp  = j.val + carry;
                j = j.next;
            }
            else {
                temp = i.val + j.val + carry;
                i = i.next;
                j = j.next;
            }
            
            tail.next = new ListNode(temp % 10);
            tail = tail.next;

            if(temp > 9){
                carry = 1;
            }
            else carry = 0;
        }
        if(carry == 1){
            tail.next = new ListNode(1);
            tail = tail.next;
        }
        return list.next;
    }

}