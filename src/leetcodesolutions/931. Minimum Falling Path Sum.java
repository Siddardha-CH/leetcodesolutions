Given an n x n array of integers matrix, return the minimum sum of any falling path through matrix.

A falling path starts at any element in the first row and chooses the element in the next row that is either 
directly below or diagonally left/right. Specifically, the next element from position (row, col) will be 
(row + 1, col - 1), (row + 1, col), or (row + 1, col + 1).



  ----------------------------------SOLUTION----------------------------------




class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];
        for (int i = n - 2; i >= 0; i--)
            for (int j = 0; j < n; j++) {
                if ( j == 0)
                    matrix[i][j] += Math.min(matrix[i + 1][j], matrix[i + 1][j + 1]);
                else if (j == n - 1)
                    matrix[i][j] += Math.min(matrix[i + 1][j], matrix[i + 1][j - 1]);
                else {
                    int k = Math.min(matrix[i + 1][j - 1],matrix[i + 1][j + 1]);
                    matrix[i][j] += Math.min(matrix[i + 1][j], k);
                }
            }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++)
            ans = Math.min(ans,matrix[0][i]);
        return ans;
    }
}
