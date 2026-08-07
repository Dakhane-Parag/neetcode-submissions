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
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode l1 = head;
        ListNode l2 = slow.next;
        slow.next = null;
        ListNode prev = null;
        ListNode next = null;
        ListNode current = l2;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        l2 = prev;

        while(l1 != null && l2 != null){
          ListNode next1 = l1.next;
          ListNode next2 = l2.next;

          l1.next = l2;
          if(next1 == null) break;
          l2.next = next1;

          l1 = next1;
          l2 = next2;

        }



    }
}
