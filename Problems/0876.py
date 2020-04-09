# LeetCode Problem 876: Middle of the Linked List
# Michael Nunn

# If running on LeetCode you must change class name to "Solution"

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

# Fast Slow Pointer Solution
# When fast pointer reaches end. Slow will be at middle node.

class middle:
    def middleNode(self, head):
        fast = head
        slow = head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
        return slow