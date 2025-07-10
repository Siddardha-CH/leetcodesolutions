# Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

____________________________________________________________________________________________________________________________________
 ---------------------------------------------------------------------------------------------------------------------------------



class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        ans = 0
        for i in columnTitle:
            v = ord(i) - 64
            ans = ans * 26 + v
        return ans
        
