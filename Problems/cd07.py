# LeetCode Problem: Counting Elements
# Michael Nunn

# If running on LeetCode you must change class name to "Solution"

class elements:
    def countElements(self, arr: List[int]) -> int:
        count: int = 0
        for i in range(len(arr)):
            if (arr[i]+1 in arr):
                count += 1
        return count