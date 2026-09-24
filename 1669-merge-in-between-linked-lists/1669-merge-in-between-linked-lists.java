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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr1 = list1;
        ListNode curr2 = list1;
        int n = 0, m = 0;
        for (int i = 1; i <=b+1; i++){
            if(i < a){
                curr1 = curr1.next;
            }
            curr2 = curr2.next;
        }
        curr1.next = list2; 
        while(curr1.next != null){
            curr1 = curr1.next;
        }
        curr1.next = curr2;
        return list1;
    }
}