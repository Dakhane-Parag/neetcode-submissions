"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""

class Solution:
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':
        if not head:
            return None

        new = {}
        current = head

        while current :
            new[current] = Node(current.val)
            current = current.next

        current = head

        while current:
            copy = new[current]

            copy.next = new.get(current.next)
            copy.random = new.get(current.random)

            current = current.next

        return new[head]
