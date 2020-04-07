# LeetCode Problem 7: Reverse Integer
# Michael Nunn

# If running on LeetCode you must change class name to "Solution"

class reverseInt:
    def reverse(self, x: int) -> int:
        sign: int = 1
        if (x < 0):
            sign = -1
            x *= sign
        x = str(x)
        lst = list(x)
        lst.reverse()
        x = "".join(lst)
        x = int(x)
        if (x > 2147483647 or x < -2147483647): # Check for overflow
            return 0
        return x*sign