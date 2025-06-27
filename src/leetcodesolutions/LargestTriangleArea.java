// Given an array of points on the X-Y plane points where points[i] = [xi, yi], return the 
//   area of the largest triangle that can be formed by any three different points. 
//   Answers within 10-5 of the actual answer will be accepted.

_______________________________________________________________________________________________
  -------------------------------------------------------------------------------------------
// The area of a triangle with vertices \((x_{1},y_{1})\), \((x_{2},y_{2})\), and \((x_{3},y_{3})\) 
// can be found using the formula: \(A=\frac{1}{2}|x_{1}(y_{2}-y_{3})+x_{2}(y_{3}-y_{1})+x_{3}(y_{1}-y_{2})|\).

  class Solution {
    public double largestTriangleArea(int[][] points) {
        double ans = 0;
        for (int i = 0; i < points.length; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];
            for (int j = i+1; j <points.length; j++) {
                int x2 = points[j][0];
                int y2 = points[j][1];
                for (int k = j + 1; k < points.length; k++) {
                    int x3 = points[k][0];
                    int y3 = points[k][1];
                    double d = Math.abs((x1 * (y2 - y3)) + (x2 * (y3 - y1)) + (x3 * (y1 - y2)));
                    ans = Math.max(ans,d);
                }
            }
        }
        return ans * 0.5;
    }
}
