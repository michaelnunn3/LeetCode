# LeetCode Problem 1046: Last Stone Weight
# Michael Nunn

# If running on LeetCode you must change class name to "Solution"

class weight:
    def lastStoneWeight(self, stones: List[int]) -> int:
        while(len(stones) >= 2):

            stones = sorted(stones)
            x = stones.pop(len(stones)-2)
            y = stones.pop(len(stones)-1)

            if (x != y):
                stones.append(y-x)
        
        if(len(stones) == 1): return stones[0]
        if(len(stones) == 0): return 0