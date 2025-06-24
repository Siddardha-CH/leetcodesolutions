# Given an integer numRows, return the first numRows of Pascal's triangle.

# In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

_______________________________________________________________________________________________________________________________________
---------------------------------------------------------------------------------------------------------------------------------------


class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        l = []
        for i in range(numRows):
            s = []
            s.append(1)
            for j in range(1, i):
                s.append(l[i - 1][j - 1] + l[i - 1][j])
            if i > 0:
                s.append(1)
            l.append(s)
        return l

        
