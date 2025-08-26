// You are given a 2D 0-indexed integer array dimensions.

// For all indices i, 0 <= i < dimensions.length, dimensions[i][0] represents the length and dimensions[i][1] 
//   represents the width of the rectangle i.

// Return the area of the rectangle having the longest diagonal. If there are multiple rectangles with the longest 
// diagonal, return the area of the rectangle having the maximum area.

 -----------------------------------------------------------------



   class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxd = 0;
        int maxa = 0;
        for (int[] i : dimensions) {
            if (maxd < ((i[0] * i[0]) + (i[1] * i[1]))) {
                maxd = ((i[0] * i[0]) + (i[1] * i[1]));
                maxa = (i[0] * i[1]);
            }
            else if (maxd == ((i[0] * i[0]) + (i[1] * i[1]))) {
                maxa = Math.max(maxa, i[0] * i[1]);
            }
        }
        return maxa;
    }
}
