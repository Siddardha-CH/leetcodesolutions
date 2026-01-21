// A k x k magic square is a k x k grid filled with integers such that every row sum, every column sum, and both diagonal sums are all equal. The integers in the magic square do not have to be distinct. Every 1 x 1 grid is trivially a magic square.

// Given an m x n integer grid, return the size (i.e., the side length k) of the largest magic square that can be found within this grid.




---------------------------SOLUTION----------------------------



  class Solution {
    public int largestMagicSquare(int[][] g) {
        int n = g.length;
        int m = g[0].length;
        int l = Math.min(n,m);
        int ans = 1;
        for (int k = 2; k <= l; k++)
            for (int i = 0; i <= n - k; i++)
                for (int j = 0; j <= m - k; j++)
                    if (val(i,j,k,g))
                        ans = Math.max(ans,k);
        return ans;
    }
    public boolean val(int i, int j, int k, int[][] g) {
        int t = 0;
        for (int c = j; c < j + k; c++) 
            t += g[i][c];
        for (int r = i; r < i + k; r++) {
            int s = 0;
            for (int c = j; c < j + k; c++)
                s += g[r][c];
            if (s != t)
                return false;
        }
        for (int c = j; c < j + k; c++) {
            int s = 0;
            for (int r = i; r < i + k; r++)
                s += g[r][c];
            if (s != t)
                return false;
        }
        int s = 0;
        for (int d = 0; d < k ;d ++)
            s += g[i + d][j + d];
        if (s != t)
            return false;
        s = 0;
        for (int d = 0; d < k; d++)
            s += g[i + d][j + k - 1 - d];
        if (s != t)
            return false;
        return true;
    }
}
