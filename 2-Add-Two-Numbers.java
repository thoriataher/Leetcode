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
 import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // should I call converter and use the returned value?
        int[] arr1 = convertListNodeToArray(l1);
        int[] arr2 = convertListNodeToArray(l2);

        BigInteger num1 = convertArrayToNumber(reverseArray(arr1));
        System.out.println(num1);
        BigInteger num2 = convertArrayToNumber(reverseArray(arr2));
        System.out.println(num2);
        BigInteger sum = num1.add(num2);

        return convertNumberToListNode(sum);
    }

    // function to convert ListNode into number
    private int[] convertListNodeToArray(ListNode list) {
        List<Integer> tempList = new ArrayList<>();
        while (list != null) {
            tempList.add(list.val);
            list = list.next;
        }
        // convert arraylist into array
        int[] arr = new int[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            arr[i] = tempList.get(i);
        }
        return arr;
    }

    // convert array to number
    private BigInteger convertArrayToNumber(int[] arr) {
        StringBuilder sb = new StringBuilder();

        for (int num : arr) {
            sb.append(num);
        }
        return new BigInteger(sb.toString());
    }

    // Reverse an array
    private int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    // convert number to ListNode
    private ListNode convertNumberToListNode(BigInteger number) {
        if (number.equals(BigInteger.ZERO)) {
            return new ListNode(0);
        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (!number.equals(BigInteger.ZERO)) {
            int digit = number.mod(BigInteger.TEN).intValue();
            current.next = new ListNode(digit);
            current = current.next;
            number = number.divide(BigInteger.TEN);

        }
        return dummy.next;
    }
}