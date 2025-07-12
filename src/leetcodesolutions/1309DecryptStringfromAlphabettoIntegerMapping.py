# You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:

# Characters ('a' to 'i') are represented by ('1' to '9') respectively.
# Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
# Return the string formed after mapping.

# The test cases are generated so that a unique mapping will always exist.

_____________________________________________________________________________________________________________________


class Solution:
    def freqAlphabets(self, s: str) -> str:
        l = []
        ans = ""
        i = 0
        while i < len(s) - 2:
            if s[i].isdigit() and s[i+1].isdigit() and s[i+2] == '#':
                ans += chr(96 + (int(s[i]) * 10 + int(s[i + 1])))
                i += 3
            else:
                ans += chr(96 + int(s[i]))
                i += 1
        for x in range(i,len(s)):
            ans += chr(96 + int(s[x]))   
        return ans
