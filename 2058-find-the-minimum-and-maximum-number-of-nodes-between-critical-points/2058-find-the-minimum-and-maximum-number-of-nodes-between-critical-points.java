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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] result = {-1,-1};
        List<Integer> list = new ArrayList<>();
        if(head == null || head.next == null || head.next.next == null) return result;
        ListNode curr = head.next; 
        ListNode prev = head; 
        int i = 2; 
        while(curr.next != null){
            if(curr.val < prev.val && curr.val < curr.next.val){
                list.add(i);
            }
            else if(curr.val > prev.val && curr.val > curr.next.val){
                list.add(i);
            }
            prev = curr;
            curr = curr.next; 
            i++; 
        }
        if(list.size() < 2) return result; 
        result[1] = list.get(list.size()-1) - list.get(0); 
        result[0] = list.get(1) - list.get(0);
        for (int j = 1 ; j < list.size() ; j++){
            if(result[0] > list.get(j) - list.get(j-1)){
                result[0] = list.get(j) - list.get(j-1);
            }
        }
        return result;
    }
}