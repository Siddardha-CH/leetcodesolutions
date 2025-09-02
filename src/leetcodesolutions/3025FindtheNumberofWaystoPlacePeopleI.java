// You are given a 2D array points of size n x 2 representing integer coordinates of some points on a 2D plane, where points[i] = [xi, yi].

// Count the number of pairs of points (A, B), where

// A is on the upper left side of B, and
// there are no other points in the rectangle (or line) they make (including the border).
// Return the count.

----------------------------------------------------------------------

  class Solution {
    public int numberOfPairs(int[][] points) {
        int ans = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (j != i) {
                    if (points[i][0] <= points[j][0] && points[i][1] >= points[j][1]) {
                        boolean k = true;
                        for (int s = 0; s < points.length; s++) {
                            if (s != i && s != j) {
                                if ((points[i][0] <= points[s][0] &&
                                        points[s][0] <= points[j][0])
                                        && (points[j][1] <= points[s][1] &&
                                                points[s][1] <= points[i][1])) {
                                    k = false;
                                }
                            }
                        }
                        if (k == true) {
                            ans += 1;
                        }
                    }
                }
            }
        }
        return ans;
    }
}
