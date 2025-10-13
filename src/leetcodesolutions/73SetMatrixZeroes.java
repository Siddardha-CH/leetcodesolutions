// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

// You must do it in place.


---------------------------SOL -1 ------------------------------------


  class Solution {
    public void setZeroes(int[][] matrix) {
        List<List<Integer>> k = new ArrayList<>();
        for (int  i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    List<Integer> m = new ArrayList<>();
                    m.add(i);
                    m.add(j);
                    k.add(m);
                }
            }
        }
        for (List<Integer> i: k) {
            int i1 = i.get(0);
            int i2 = i.get(1);
            for (int j = 0 ; j < matrix[0].length; j++) {
                matrix[i1][j] = 0;
            }
            for (int j = 0 ; j < matrix.length; j++) {
                matrix[j][i2] = 0;
            }
        } 
    }
}
