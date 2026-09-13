You are given two images, img1 and img2, represented as binary, square matrices of size n x n. A binary matrix has only 0s and 1s as values.

We translate one image however we choose by sliding all the 1 bits left, right, up, and/or down any number of units. We then place it on top of the other image. We can then calculate the overlap by counting the number of positions that have a 1 in both images.

Note also that a translation does not include any kind of rotation. Any 1 bits that are translated outside of the matrix borders are erased.

Return the largest possible overlap.






class Solution {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-13-08                                             #
        #                                                                       #
        #########################################################################
        */
    public int largestOverlap(int[][] arr1, int[][] arr2) {
        int ans = 0;
        int n = arr1.length;
        for (int rowoff = -n+1; rowoff < n; rowoff++) // as it can moves up to down
            for (int coloff = -n+1; coloff < n; coloff++) // as it can move left to right follwed by row
                ans = Math.max(ans, func(arr1, arr2, rowoff, coloff));
        return ans;
    }

    public int func(int[][] arr1, int[][] arr2, int rowoff, int coloff) {
        int n = arr1.length;
        int cnt = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                // A[i][j] -> B[i + rowoff][j + coloff]
                int newi = i + rowoff;
                int newj = j + coloff;
                if (newi < 0 || newj < 0 || newi >= n || newj >= n)
                    continue;
                if (arr1[i][j] == 1 && arr2[newi][newj] == 1)
                    cnt += 1;
            }
        return cnt;
    }
}
