# LeetCode Problem 1342: Number of Steps to Reduce a Number to Zero
# Michael Nunn

# If running on LeetCode you must change class name to "Solution"

class numSteps:
    def numberOfSteps (self, num: int) -> int:
        steps: int = 0
        while (num != 0):
            if (num % 2 == 0):
                num /= 2
                steps += 1
            else:
                num -= 1
                steps += 1
        return steps