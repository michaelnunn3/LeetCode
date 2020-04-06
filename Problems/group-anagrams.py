# LeetCode Problem 49: Group Anagrams
# Michael Nunn

# If running on LeetCode you must change class name to "Solution"

import collections

class anagram:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
      anagrams = collections.defaultdict(list)
      for word in strs:
        anagrams[''.join(sorted(word))].append(word)
      return list(anagrams.values())