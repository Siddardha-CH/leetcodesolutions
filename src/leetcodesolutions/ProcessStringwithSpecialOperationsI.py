# You are given a string s consisting of lowercase English letters and the special characters: *, #, and %.

# Build a new string result by processing s according to the following rules from left to right:

# If the letter is a lowercase English letter append it to result.
# A '*' removes the last character from result, if it exists.
# A '#' duplicates the current result and appends it to itself.
# A '%' reverses the current result.
# Return the final string result after processing all characters in s.

# Note: Please do not copy the description during the contest to maintain the integrity of your submissions.

_______________________________________________________________________________________________________________
 -------------------------------------------------------------------------------------------------------------


class Solution:
    def processStr(self, s: str) -> str:
        l = []
        for i in s:
            if i.isalpha():
                l.append(i)
            elif i == "*":
                if len(l) > 0:
                    l.pop()
            elif i == "#":
                if len(l) > 0:
                    l += l.copy()
            else:
                if len(l) > 0:
                    l = l[::-1]
        ans = ""
        for i in l:
            ans += i
        return ans
        
