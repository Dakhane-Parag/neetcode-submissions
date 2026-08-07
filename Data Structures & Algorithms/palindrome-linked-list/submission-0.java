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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        int size = 0;
        ListNode current = head;
        while(current != null){
            size++;
            current = current.next;
        }

        int[] arr = new int[size];
        current = head;
        for(int i = 0;i<arr.length;i++){
            arr[i] = current.val;
            current = current.next;
        }

        int l = 0;
        int r = arr.length -1;

        while(l<r){
            if(arr[l] != arr[r]){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}