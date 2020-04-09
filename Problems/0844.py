# LeetCode Problem 844: Backspace String Compare
# Michael Nunn

# If running on LeetCode you must change class name to "Solution"

class backspace:
    def backspaceCompare(self, S: str, T: str) -> bool:
        
        sCount: int = S.count('#')
        tCount: int = T.count('#')
            
        while(sCount>0):
            sBack: int = S.find('#')
            if(sBack == 0):
                S = S[:0] + S[sBack+1:]
            else:
                S = S[:sBack-1] + S[sBack+1:]
            sCount -= 1
            
        while(tCount>0):
            tBack: int = T.find('#')
            if(tBack == 0):
                T = T[:0] + T[tBack+1:]
            else:
                T = T[:tBack-1] + T[tBack+1:]
            tCount -= 1
        
        return S == T