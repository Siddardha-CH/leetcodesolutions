// Given a rows x cols binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.



__________________________________SOLUTION__________________________________



  class Solution {
    public int maximalRectangle(char[][] m) {
        int ans = 0;
        int[][] matrix = new int[m.length][m[0].length];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++) {
                if (i > 0 && m[i][j] == '1')
                    matrix[i][j] = 1 + matrix[i -1][j];
                if (i == 0 && m[i][j] == '1')
                    matrix[i][j] = 1;
            }
        for (int[] h : matrix) {
            Stack<Integer> st = new Stack<>();
            st.push(-1);
            for (int i = 0; i < h.length; i++) {
                while (st.peek() != -1 && h[i] <= h[st.peek()]) {
                    int k = h[st.pop()];
                    ans = Math.max(ans,k * (i - st.peek() - 1));
                }
                st.push(i);
            }
            while (st.peek() != -1) {
                int k = h[st.pop()];
                ans = Math.max(ans,k * (h.length - st.peek() - 1));
            } 
        }
        return ans;
    }
}
