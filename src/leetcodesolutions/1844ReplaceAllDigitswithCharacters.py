# You are given a 0-indexed string s that has lowercase English letters in its even indices and digits in its odd indices.

# You must perform an operation shift(c, x), where c is a character and x is a digit, that returns the xth character after c.

# For example, shift('a', 5) = 'f' and shift('x', 0) = 'x'.
# For every odd index i, you want to replace the digit s[i] with the result of the shift(s[i-1], s[i]) operation.

# Return s after replacing all digits. It is guaranteed that shift(s[i-1], s[i]) will never exceed 'z'.

# Note that shift(c, x) is not a preloaded function, but an operation to be implemented as part of the solution.


---------------------------------------------------------------------------




class Solution:
    def replaceDigits(self, s: str) -> str:
        ans = ""
        for i in range(len(s) ):
            if s[i].isalpha():
                ans += s[i]
            else :
                ans += chr(ord(s[i - 1]) + int(s[i]))
        return ans
