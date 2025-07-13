# Given an integer n, return a string with n characters such that each character in such string occurs an odd number of times.

# The returned string must contain only lowercase English letters. If there are multiples valid strings, return any of them.  

__________________________________________________________________________________________________________________________
   --------------------------------------------------------------------------------------------------------------------


class Solution:
    def generateTheString(self, n: int) -> str:
        if n % 2 == 0:
            a = n - 1
            ans = ""
            for i in range(a):
                ans += "a"
            ans += "b"
            return ans
        else:
            ans = ""
            for i in range(n):
                ans += "a"
            return ans
            


        
