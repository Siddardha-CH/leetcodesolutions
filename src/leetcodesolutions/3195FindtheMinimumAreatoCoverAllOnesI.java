// You are given a 2D binary array grid. Find a rectangle with horizontal and vertical 
// sides with the smallest area, such that all the 1's in grid lie inside this rectangle.

// Return the minimum possible area of the rectangle.


-----------------------------------------------------------------------------------

class Solution {
    public int minimumArea(int[][] grid) {
        int l1 =9999;
        int l2 = 0;
        int b1 = 9999;
        int b2 =0;

        for (int i = 0; i< grid.length;i++) {
            for (int j =0 ; j < grid[i].length;j++) {
                if (grid[i][j] == 1) {
                    l1 = Math.min(l1,i);
                    l2 = Math.max(l2,i);
                    b1 = Math.min(b1,j);
                    b2 = Math.max(b2,j);
                }
            }
        }
        System.out.println(l1  + " " + l2 + " " + b1 + " " + b2);
        return ((l2 - l1) + 1) * ((b2 - b1) + 1);
    }
}
