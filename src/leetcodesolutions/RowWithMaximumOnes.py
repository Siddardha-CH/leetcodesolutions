# Given a m x n binary matrix mat, find the 0-indexed position of the row that contains 
# the maximum count of ones, and the number of ones in that row.

# In case there are multiple rows that have the maximum count of ones, the row with the 
# smallest row number should be selected.

# Return an array containing the index of the row, and the number of ones in it.

_______________________________________________________________________________________________________________________________________
---------------------------------------------------------------------------------------------------------------------------------------



class Solution:
    def rowAndMaximumOnes(self, mat: List[List[int]]) -> List[int]:
      #SOLUTION - 1
        # ans1 = 0
        # ans2 = 0
        # for i in range(len(mat)):
        #     maxi = 0
        #     for j in range(len(mat[i])):
        #         if mat[i][j] == 1:
        #             maxi += 1
        #     if maxi > ans2:
        #         ans2 = max(ans2, maxi)
        #         ans1 = i
        # return [ans1,ans2]


      #SOLTION - 2
        a1 = 0
        a2 = 0
        for i in range(len(mat)):
            c = sum(mat[i])
            if c > a2:
                a2 = c
                a1 = i
        return [a1,a2]


                

        
