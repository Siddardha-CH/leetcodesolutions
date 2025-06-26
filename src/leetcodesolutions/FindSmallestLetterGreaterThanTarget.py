# You are given an array of characters letters that is sorted in non-decreasing order, 
# and a character target. There are at least two different characters in letters.

# Return the smallest character in letters that is lexicographically greater than target. 
# If such a character does not exist, return the first character in letters.

___________________________________________________________________________________________________________________________________
-----------------------------------------------------------------------------------------------------------------------------------


class Solution:
    def nextGreatestLetter(self, letters: List[str], target: str) -> str:
        s = 99999
        for i in letters:
            if i > target:
                return i
        return letters[0]
