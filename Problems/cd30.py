# LeetCode Problem: Check If a String Is a Valid Sequence from Root to Leaves Path in a Binary Tree
# Michael Nunn

# If running on LeetCode you must change class name to "Solution"

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class validSequence:

    def isValidSequence(self, root: TreeNode, arr: List[int]) -> bool:
        if not root:
            return False
        
        def isLeaf(node):
            return node.left is None and node.right is None
        
        def util(node, arr):
            if (not arr and node) or (not node):
                return False
            
            if arr[0] != node.val:
                return False
            
            if arr == [node.val] and isLeaf(node):
                return True
            
            if util(node.left, arr[1:]) or util(node.right, arr[1:]):
                return True
            
            return False
        
        return util(root, arr)