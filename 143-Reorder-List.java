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
    public void reorderList(ListNode head) {
        List<Integer> arr = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            arr.add(current.val);
            current = current.next;
        }
        int start = 0, end = arr.size() - 1;
        current = head;
        boolean flag = true;
        while (current != null) {
            if (flag) {
                current.val = arr.get(start++);
            } else {
                current.val = arr.get(end--);
            }
            flag = !flag;
            current = current.next;
        }
    }
}