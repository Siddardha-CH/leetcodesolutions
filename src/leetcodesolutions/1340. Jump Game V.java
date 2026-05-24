Given an array of integers arr and an integer d. In one step you can jump from index i to index:

i + x where: i + x < arr.length and  0 < x <= d.
i - x where: i - x >= 0 and  0 < x <= d.
In addition, you can only jump from index i to index j if arr[i] > arr[j] and arr[i] > arr[k] for all indices k between i and j (More formally min(i, j) < k < max(i, j)).

You can choose any index of the array and start jumping. Return the maximum number of indices you can visit.

Notice that you can not jump outside of the array at any time.




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
        #  Date        : 2026-05-24                                             #
        #                                                                       #
        #########################################################################
        */
    public int maxJumps(int[] arr, int d) {
        int ans = 0;
        int n = arr.length;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++)
            ans = Math.max(ans, dfs(i, arr, n, dp, d));
        if (ans == 0)
            return 1;
        return ans;
    }

    public int dfs(int i, int[] arr, int n, int[] dp, int d) {
        if (dp[i] != 0)
            return dp[i];
        
        int k = Math.min(i + d + 1, n);
        int m = 1;
        for (int j = i + 1; j < k; j++)
            if (arr[j] >= arr[i])
                break;
            else
                m = Math.max(m, 1 + dfs(j, arr, n, dp, d));
        k = Math.max(0, i - d);
        for (int j = i - 1; j >= k; j--) 
            if (arr[j] >= arr[i])
                break;
            else
                m = Math.max(m, 1 + dfs(j, arr, n, dp, d));
        dp[i] = m;
        return m;
    }   
}
