// A valid cut in a circle can be:

// A cut that is represented by a straight line that touches two points on the edge of the circle and passes through its center, or
// A cut that is represented by a straight line that touches one point on the edge of the circle and its center.
// Some valid and invalid cuts are shown in the figures below.


// Given the integer n, return the minimum number of cuts needed to divide a circle into n equal slices.


class Solution {
    public int numberOfCuts(int n) {
        if ( n == 1) {
            return 0;
        }
        if (n % 2 == 1) {
            return n;
        }
        return n/2;
        
    }
}
