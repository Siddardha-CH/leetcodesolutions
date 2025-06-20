// You are given an m x n matrix grid consisting of positive integers.

// Perform the following operation until grid becomes empty:

// Delete the element with the greatest value from each row. If multiple such elements exist, delete any of them.
// Add the maximum of deleted elements to the answer.
// Note that the number of columns decreases by one after each operation.

// Return the answer after performing the operations described above.


__________________________________________________________________________________________________________________________________________
------------------------------------------------------------------------------------------------------------------------------------------

class Solution {
    public int deleteGreatestValue(int[][] grid) {
       for ( int i = 0; i < grid.length; i++) {
        Arrays.sort(grid[i]);
       } 
       int ans = 0;
       int a  = grid[0].length-1;
       while (a >= 0) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
        max = Math.max(max, grid[i][a]);
        }    
       ans += max;
       a--;
       }
       return ans;
    }
}
