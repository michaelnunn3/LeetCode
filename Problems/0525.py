# LeetCode Problem 525: Contiguous Array
# Source: https://leetcode.com/problems/contiguous-array/discuss/99655/Python-O(n)-Solution-with-Visual-Explanation

# If running on LeetCode you must change class name to "Solution"

class maxLen:
    def findMaxLength(self, nums: List[int]) -> int:
        count = 0
        max_length=0
        table = {0: 0}
        for index, num in enumerate(nums, 1):
            if num == 0:
                count -= 1
            else:
                count += 1
            
            if count in table:
                max_length = max(max_length, index - table[count])
            else:
                table[count] = index
        
        return max_length