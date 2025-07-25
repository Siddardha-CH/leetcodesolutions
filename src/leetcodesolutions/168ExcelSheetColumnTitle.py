# Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

class Solution:
    def convertToTitle(self, columnNumber: int) -> str:
        ans = ""
        while columnNumber > 0:
            columnNumber -= 1
            ans = chr(columnNumber % 26 + 65) + ans
            columnNumber //= 26
        return ans
