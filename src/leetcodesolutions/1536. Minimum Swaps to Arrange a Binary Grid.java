Given an n x n binary grid, in one step you can choose two adjacent rows of the grid and swap them.

A grid is said to be valid if all the cells above the main diagonal are zeros.

Return the minimum number of steps needed to make the grid valid, or -1 if the grid cannot be valid.

The main diagonal of a grid is the diagonal that starts at cell (1, 1) and ends at cell (n, n).





  --------------------------------------SOLUTION------------------------------------





class Solution {
    public int minSwaps(int[][] grid) {
        int[] k = new int[grid.length];
        for (int i = 0; i < grid.length; i++) {
            int c = 0;
            for (int j = grid[i].length - 1; j >= 0 ; j--) {
                if (grid[i][j] == 1)
                    break;
                else 
                    c += 1;
            }
            k[i] = c;
        }
        int ans = 0;
        for (int i = 0; i < k.length; i++) {
            int j = i;
            while (j < k.length && k[j] < k.length - i - 1) {
                j += 1;
            }
            if (j == k.length)
                return -1;
            else {
                ans += j - i;
                for (int p = j; p > i; p--) {
                    int t = k[p - 1];
                    k[p - 1] = k[p];
                    k[p] = t;
                }
            }
        }
        return ans;
    }
}
