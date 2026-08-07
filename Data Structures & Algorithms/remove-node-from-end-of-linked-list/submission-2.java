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
        if(head.next == null){
            head= null;
            return head;
        }
        int size = 0;
        ListNode current = head;
        while(current != null){
            size++;
            current = current.next;
        }
        if(size == n){
            return head.next;
        }

        ListNode prev = null;
        current = head;
        for(int i = 0; i<size - n;i++){
            prev = current;
            current = current.next;
        }
        prev.next = current.next;
        return head;
    }
}
