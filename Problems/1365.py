# LeetCode Problem 1365: How Many Numbers Are Smaller Than the Current Number
# Michael Nunn

# If running on LeetCode you must change class name to "Solution"

class smallerNums:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        count: int = [0] * len(nums)
        for i in range(len(nums)):
            for j in range(len(nums)):
                if (nums[i] > nums[j]):
                    count[i] += 1
                    
        return count