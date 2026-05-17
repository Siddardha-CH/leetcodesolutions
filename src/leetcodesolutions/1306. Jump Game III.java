Given an array of non-negative integers arr, you are initially positioned at start index of the array. When you are at index i, you can jump to i + arr[i] or i - arr[i], check if you can reach any index with value 0.

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
        #  Date        : 2026-05-17                                             #
        #                                                                       #
        #########################################################################
        */
    public boolean canReach(int[] arr, int start) {
        boolean[] visited = new boolean[arr.length];
        return dfs(arr, start, visited);
    }

    public boolean dfs(int[] arr, int i, boolean[] visited) {
        if (i < 0 || i >= arr.length) 
            return false;
        if (visited[i])
            return false;
        if (arr[i] == 0)
            return true;

        visited[i] = true;
        int r = arr[i] + i;
        int l = i - arr[i];
        return dfs(arr, l, visited) || dfs(arr, r, visited);
    }
}
