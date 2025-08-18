# Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

# Given a balanced string s, split it into some number of substrings such that:

# Each substring is balanced.
# Return the maximum number of balanced strings you can obtain.


_______________________________________________________________________________


class Solution:
    def balancedStringSplit(self, s: str) -> int:
        r = 0
        l = 0
        ans = 0
        for i in s:
            if i == 'R':
                r += 1
            else:
                l += 1
            if r == l:
                ans += 1
                r = 0
                l = 0
        return ans
        
