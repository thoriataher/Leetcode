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
    public void reorderList(ListNode head) {
        //1. Find the midpoint using slow & fast Pointer
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //2. Reverse the second half
        ListNode current = slow.next;
        slow.next = null; //split the list into halves
        ListNode previous = null;
        while(current != null){
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }        
        //3. Join them and reorder
        ListNode p1 = head;
        ListNode p2 = previous;
        while(p2 != null){
            ListNode temp1 = p1.next;
            ListNode temp2 = p2.next;
            p1.next = p2;
            p2.next = temp1;
            //move the pointers
            p1 = temp1;
            p2 = temp2;
        }
    }
}