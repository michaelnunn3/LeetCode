# LeetCode Problem: Perform String Shifts
# Michael Nunn

# If running on LeetCode you must change class name to "Solution"

class strShift:
    def stringShift(self, s: str, shift: List[List[int]]) -> str:
        left = 0
        length = len(s)
        for direction, amount in shift:
            if (direction == 0):
                left += amount
            else:
                left -= amount
        left %= length
        return s[left:] + s[:left] 