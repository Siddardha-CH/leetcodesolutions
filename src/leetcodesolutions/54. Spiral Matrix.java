Given an m x n matrix, return all elements of the matrix in spiral order.



  --------------------------------------SOLUTION----------------------------------------



class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int r = matrix[0].length - 1;
        int d = matrix.length - 1;
        int l = 0;
        int u = 0;
        while (l <= r && u <= d) { 
            for (int col = l; col <= r; col++) 
                ans.add(matrix[u][col]);
            u++;
            for (int row = u; row <= d; row++) 
                ans.add(matrix[row][r]);
            r--;
            if (u <= d) {
                for (int col = r; col >= l; col--) 
                    ans.add(matrix[d][col]);    
                d--;
            }
            if (l <= r) {
                for (int row = d; row >= u; row--) 
                    ans.add(matrix[row][l]);
                l++;
            }
        }
        return ans;
    }
}
