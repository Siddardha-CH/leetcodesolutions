# You are given a 0-indexed circular string array words and a string target.
# A circular array means that the array's end connects to the array's beginning.

# Formally, the next element of words[i] is words[(i + 1) % n] and the previous 
# element of words[i] is words[(i - 1 + n) % n], where n is the length of words.
# Starting from startIndex, you can move to either the next word or the previous
# word with 1 step at a time.

# Return the shortest distance needed to reach the string target. If the string
# target does not exist in words, return -1.


___________________________________________________________________________________________________________________________________
------------------------------------------------------------------------------------------------------------------------------------


class Solution:
    def closestTarget(self, words: List[str], target: str, startIndex: int) -> int:
        a = 999999
        for i in range( len(words) ):
            if words[i] == target:
                s = abs (i - startIndex)
                a = min(a, (min(s , len(words) - s )))
        if a == 999999:
            return -1
        return a

 
