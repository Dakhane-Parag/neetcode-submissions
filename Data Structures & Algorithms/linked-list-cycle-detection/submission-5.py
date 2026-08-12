# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:

        # BruteForce approach
        # visited = set()
        # current = head

        # while current:
        #     if current in visited:
        #         return True
            
        #     visited.add(current)
        #     current = current.next

        # return False

        
        slow = head
        fast = head

        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

            if fast == slow:
                return True

        return False

        