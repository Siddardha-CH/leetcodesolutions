// An n x n matrix is valid if every row and every column contains all the integers from 1 to n (inclusive).

// Given an n x n integer matrix matrix, return true if the matrix is valid. Otherwise, return false.


--------------------------------SOLUTION------------------------------------------


class Solution {
    public boolean checkValid(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int[] k = new int[matrix.length];
            for (int j = 0; j < matrix.length; j++) {
                k[j] = matrix[i][j];
            }
            Arrays.sort(k);
            int c = 1;
            for (int n : k) {
                if (n != c) {
                    return false;
                }
                c += 1;
            }
            System.out.println("-");
        }
        for (int i = 0; i < matrix.length; i++) {
            int[] k = new int[matrix.length];
            for (int j = 0; j < matrix.length; j++) {
                k[j] = matrix[j][i];
            }
            Arrays.sort(k);
            int c = 1;
            for (int n : k) {
                if (n != c) {
                    return false;
                }
                c += 1;
            }
        }
        return true;
    }
}
