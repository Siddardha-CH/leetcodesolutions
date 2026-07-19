A peak element in a 2D grid is an element that is strictly greater than all of its adjacent neighbors to the left, right, top, and bottom.

Given a 0-indexed m x n matrix mat where no two adjacent cells are equal, find any peak element mat[i][j] and return the length 2 array [i,j].

You may assume that the entire matrix is surrounded by an outer perimeter with the value -1 in each cell.

You must write an algorithm that runs in O(m log(n)) or O(n log(m)) time.

 



class Solution {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-07-19                                             #
        #                                                                       #
        #########################################################################
        */
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int l = 0;
        int r = m - 1;
        while (r >= l)  {
            int mid = (l + r) / 2;
            int idx = -1;
            int maxi = -1;
            for (int i = 0; i < n; i++)
                if (mat[i][mid] > maxi) {
                    maxi = mat[i][mid];
                    idx = i;
                }
            int left = -1;
            int right = -1;
            if (mid - 1 >= 0)
                left = mat[idx][mid - 1];
            if (mid + 1 < m)
                right = mat[idx][mid + 1];
            
            if (mat[idx][mid] > left && mat[idx][mid] > right)
                return new int[] {idx, mid};
            else if (mat[idx][mid] < left)
                r = mid - 1;
            else
                l = mid + 1;
        }   
        return new int[] {0,0};
    }
}
