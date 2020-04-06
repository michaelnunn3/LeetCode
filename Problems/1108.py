# LeetCode Problem 1108: Defanging an IP Address
# Michael Nunn

# If running on LeetCode you must change class name to "Solution"

class defang:
    def defangIPaddr(self, address: str) -> str:
        return address.replace('.','[.]')
        