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
    public ListNode reverseList(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while(head != null){
            stack.push(head.val);
            head = head.next;
        }
        ListNode reversedList = new ListNode(Integer.MIN_VALUE);
        ListNode ptr = reversedList;
        while(!stack.isEmpty()){
            ptr.next = new ListNode(stack.pop());
            ptr = ptr.next;
        }
        return reversedList.next;
    }
}