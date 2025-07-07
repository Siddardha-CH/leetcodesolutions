// You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

// You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

____________________________________________________________________________________________________________________________________________________________
   -----------------------------------------------------------------------------------------------------------------------------------------------------

  class Solution {
    public void rotate(int[][] matrix) {
        // To solve this I first transpose it and then reverse 
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            int l = 0;
            int r = n - 1;
            while (l < r) {
                int temp = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = temp;
                l ++;
                r --;
            }
        }
    }
}
