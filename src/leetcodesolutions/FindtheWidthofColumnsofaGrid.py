# You are given a 0-indexed m x n integer matrix grid. The width of a column is the maximum length of its integers.

# For example, if grid = [[-10], [3], [12]], the width of the only column is 3 since -10 is of length 3.
# Return an integer array ans of size n where ans[i] is the width of the ith column.

# The length of an integer x with len digits is equal to len if x is non-negative, and len + 1 otherwise.

_______________________________________________________________________________________________________________________________________
---------------------------------------------------------------------------------------------------------------------------------------

class Solution:
    def findColumnWidth(self, grid: List[List[int]]) -> List[int]:
        ans = []
        for i in range(len(grid[0])):
            t = 0
            for j in range(len(grid)):
                if j < len(grid):
                    t = max(t, len(str(grid[j][i])))
            ans.append(t)
        return ans 
        
