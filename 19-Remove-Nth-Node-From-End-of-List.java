/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // reverse the list
        head = reverseList(head);
        // remove the nth node
        if (n == 1) {
            head = head.next;
        } else {
            ListNode curr = head;
            for (int i = 1; i < n - 1; i++) {
                if (curr.next != null) {
                    curr = curr.next;
                }
            }
            if (curr.next != null) {
                curr.next = curr.next.next;
            }
        }
        // return the reverse of the reverse

        return reverseList(head);

    }

    private ListNode reverseList(ListNode head) {
        ListNode curr = head, next = null, prev = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}