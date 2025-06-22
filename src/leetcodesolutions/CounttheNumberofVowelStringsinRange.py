# You are given a 0-indexed array of string words and two integers left and right.

# A string is called a vowel string if it starts with a vowel character and ends with a vowel 
# character where vowel characters are 'a', 'e', 'i', 'o', and 'u'.

# Return the number of vowel strings words[i] where i belongs to the inclusive range [left, right].

______________________________________________________________________________________________________________________________________
--------------------------------------------------------------------------------------------------------------------------------------

class Solution:
    def vowelStrings(self, words: List[str], left: int, right: int) -> int:
        l = ['a','e','i','o','u']
        ans = 0
        for i in range(left,right+1):
            if words[i][0] in l and words[i][-1] in l:
                ans += 1
        return ans

        
