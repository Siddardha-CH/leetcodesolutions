// There exist n rectangles in a 2D plane with edges parallel to the x and y axis. You are given two 2D integer arrays bottomLeft and topRight where bottomLeft[i] = [a_i, b_i] and topRight[i] = [c_i, d_i] represent the bottom-left and top-right coordinates of the ith rectangle, respectively.

// You need to find the maximum area of a square that can fit inside the intersecting region of at least two rectangles. Return 0 if such a square does not exist.


-----------------------------------SOLUTION------------------------------------


  class Solution {
    public long largestSquareArea(int[][] bl, int[][] tr) {
        long ans = 0;
        for (int i = 0; i < bl.length; i++) 
            for (int j = i + 1; j < bl.length; j++) {
                int w = Math.min(tr[i][0],tr[j][0]) - Math.max(bl[i][0],bl[j][0]);
                int h = Math.min(tr[i][1],tr[j][1]) - Math.max(bl[i][1],bl[j][1]);
                int s = Math.min(h,w);
                if (s > 0)
                    ans = Math.max(ans, (long)s * s);
            }
        return ans;
    }
}
