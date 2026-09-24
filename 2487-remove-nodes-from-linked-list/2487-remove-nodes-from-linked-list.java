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
    public ListNode removeNodes(ListNode head) {
        ListNode list = new ListNode(0);
        ListNode ans = list;
        ListNode curr = head;
        Deque<Integer> stack = new ArrayDeque<>();
        while(curr != null){
            int val = curr.val;

            while(!stack.isEmpty() && stack.peek() < val){
                stack.pop();
            }
            stack.push(val);
            curr = curr.next;
        }
        while(!stack.isEmpty()){
            int val = stack.pollLast();
            ans.next = new ListNode(val);
            ans = ans.next;

        }
        return list.next;
    }
}