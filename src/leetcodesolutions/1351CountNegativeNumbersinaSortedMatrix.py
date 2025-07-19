# Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.

_________________________________________________________________________________________________________________________________________________



class Solution:
    def countNegatives(self, grid: List[List[int]]) -> int:
        ans = 0 
        for i in grid:
            for j in i:
                if j < 0:
                    ans += 1
        return ans
        
