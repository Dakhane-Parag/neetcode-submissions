# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head.next == None:
            head = None
            return head

        length = 0
        current = head

        while current:
            length += 1
            current = current.next

        if length == n:
            return head.next
            
        current = head
        prev = None
        for i in range(length - n):
            prev = current
            current = current.next

        prev.next = current.next
        current.next = None

        return head



            