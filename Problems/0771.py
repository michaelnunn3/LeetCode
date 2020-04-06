# LeetCode Problem 771: Jewels and Stones
# Michael Nunn

# If running on LeetCode you must change class name to "Solution"


class jewels:
    def numJewelsInStones(self, J: str, S: str) -> int:
        chars: str = list(J)
        num: int = 0
        for i in chars:
            num += S.count(i)
        return num