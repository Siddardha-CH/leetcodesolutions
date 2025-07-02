// Given an m x n binary matrix mat, return the number of special positions in mat.

// A position (i, j) is called special if mat[i][j] == 1 and all other elements in row i and column j are 0 (rows and columns are 0-indexed).

____________________________________________________________________________________________________________________________________________
   --------------------------------------------------------------------------------------------------------------------------------------


  class Solution {
    public int numSpecial(int[][] mat) {
        int ans = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1 && check(i, j, mat)) {
                    ans++;
                }
            }
        }
        return ans;
    }
        public boolean check (int a, int b, int[][] mat) {
            int c1 = 0;
            int c2 = 0;
            for (int i = 0; i < mat.length; i++) {
                if (mat[i][b] == 1) {
                    c1 += 1;
                }
            }
            if (c1 > 1) {
                return false;
            }
            for (int i = 0; i < mat[0].length; i++) {
                if (mat[a][i] == 1) {
                    c2 += 1;
                }
            }
            if (c2 > 1) {
                return false;
            }
            return true;
        }
}

 
