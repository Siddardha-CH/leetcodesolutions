There are n cities. Some of them are connected, while some are not. If city a is connected directly with city b, 
and city b is connected directly with city c, then city a is connected indirectly with city c.

A province is a group of directly or indirectly connected cities and no other cities outside of the group.

You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the ith city and the jth city are directly
connected, and isConnected[i][j] = 0 otherwise.

Return the total number of provinces.



----------------------------------SOLUTION--------------------------------------




class Solution {
    public int findCircleNum(int[][] arr) {
        int ans = 0;
        boolean[] k = new boolean[arr.length];
        for (int i = 0;i < arr.length; i++)
            if (k[i] == false) {
                dfs(arr, k, i);
                ans += 1;
            }
        return ans;
    }
    public void dfs(int[][] arr, boolean[] k, int j) {
        k[j] = true;
        for (int i = 0; i < arr.length; i++)
            if (arr[j][i] == 1 && !k[i])
                dfs(arr, k, i);
    } 
}
