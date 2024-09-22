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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode current = head;
        while(current != null){
            arr.add(current.val);
            current = current.next;
        }
        int indexToRemove = arr.size() - n;
        arr.remove(indexToRemove);

        if(arr.isEmpty()){
            return null;
        }
        //convert it to listNode
        ListNode newHead = new ListNode(arr.get(0));
        ListNode newCurrent = newHead;

        for(int i =1; i < arr.size(); i++){
            newCurrent.next = new ListNode(arr.get(i));
            newCurrent = newCurrent.next;
        }
        return newHead;
    }
}