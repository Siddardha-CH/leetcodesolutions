# Given an input string s, reverse the order of the words.

# A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

# Return a string of the words in reverse order concatenated by a single space.

# Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string 
# should only have a single space separating the words. Do not include any extra spaces.


--------------------------------------------------------


class Solution:
    def reverseWords(self, s: str) -> str:
        l = s.split()
        ans = ""
        for i in range(len(l) - 1,0,-1):
            ans += l[i]
            ans += " "
        ans += l[0]
        return ans
        
