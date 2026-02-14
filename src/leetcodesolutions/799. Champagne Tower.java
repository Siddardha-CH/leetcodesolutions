We stack glasses in a pyramid, where the first row has 1 glass, the second row has 2 glasses, and so on until the 100th row.  Each glass holds one cup of champagne.

Then, some champagne is poured into the first glass at the top.  When the topmost glass is full, any excess liquid poured will fall equally to the glass immediately 
to the left and right of it.  When those glasses become full, any excess champagne will fall equally to the left and right of those glasses, and so on.
(A glass at the bottom row has its excess champagne fall on the floor.)

For example, after one cup of champagne is poured, the top most glass is full.  After two cups of champagne are poured, the two glasses on the second row are half full. 
After three cups of champagne are poured, those two cups become full - there are 3 full glasses total now.  After four cups of champagne are poured, 
the third row has the middle glass half full, and the two outside glasses are a quarter full, as pictured below.



Now after pouring some non-negative integer cups of champagne, return how full the jth glass in the ith row is (both i and j are 0-indexed.)






  -----------------------------------------------SOLUTION---------------------------------------------





  class Solution {
    public double champagneTower(int p, int r, int c) {
        if ( p == 0)
            return (double)0;
        // double[][] dp = new double[100][100];
        // dp[0][0] = (double)p;
        // for (int i = 0; i < r; i ++) 
        //     for (int j = 0; j <= i; j ++) 
        //         if (dp[i][j] >= 1) {
        //             dp[i + 1][j] += (double)(dp[i][j] - 1) / 2;
        //             dp[i + 1][j + 1] += (double)(dp[i][j] - 1) / 2;
        //             dp[i][j] = 1;
        //         }
        // return Math.min(1, dp[r][c]);
        double[] prev = new double[100];
        double[] curr = new double[100];
        curr[0] = (double) p;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <= i; j ++) {
                if (curr[j] >= 1) {
                    prev[j] += (double) (curr[j] - 1) / 2;
                    prev[j + 1] += (double) (curr[j] - 1) / 2;
                }
            }
            for (int k = 0; k < 100; k++) {
                curr[k] = prev[k];
                prev[k] = 0;
            }
        }
        return Math.min(1,curr[c]);
    }       
}
