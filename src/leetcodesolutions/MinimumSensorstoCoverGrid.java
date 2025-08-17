// Medium
// 4 pt.
// You are given n × m grid and an integer k.

// A sensor placed on cell (r, c) covers all cells whose Chebyshev distance from (r, c) is at most k.

// The Chebyshev distance between two cells (r1, c1) and (r2, c2) is max(|r1 − r2|,|c1 − c2|).

// Your task is to return the minimum number of sensors required to cover every cell of the grid.©leetcode

____________________________________________________________________



  class Solution {
    public int minSensors(int n, int m, int k) {
        int area = 2 * k + 1;
        int r = n + area ;
        int c = m + area ;
        return ((r - 1) / area) * ((c - 1) / area);
    }
}©leetcode
