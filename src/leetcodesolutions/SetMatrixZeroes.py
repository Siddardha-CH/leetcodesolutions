# Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

# You must do it in place.


________________________________________________________________________________________________________________________________________
----------------------------------------------------------------------------------------------------------------------------------------

class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        l = []
        for i in range(len(matrix)):
            for j in range(len(matrix[i])):
                if matrix[i][j] == 0:
                    l.append([i,j])
        print(l)
        n = len(matrix)
        m = len(matrix[0])
        for i in l:
            a = i[0]
            b = i[1]
            for i in range(n):
                matrix[i][b] = 0
            for i in range(m):
                matrix[a][i] = 0
        
