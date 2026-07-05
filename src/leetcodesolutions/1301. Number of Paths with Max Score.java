You are given a square board of characters. You can move on the board starting at the bottom right square marked with the character 'S'.

You need to reach the top left square marked with the character 'E'. The rest of the squares are labeled either with a numeric character 1, 2, ..., 9 or with an obstacle 'X'. In one move you can go up, left or up-left (diagonally) only if there is no obstacle there.

Return a list of two integers: the first integer is the maximum sum of numeric characters you can collect, and the second is the number of such paths that you can take to get that maximum sum, taken modulo 10^9 + 7.

In case there is no path, return [0, 0].




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
        #  Date        : 2026-07-05                                             #
        #                                                                       #
        #########################################################################
        */
    public int[] pathsWithMaxScore(List<String> board) {
        int n = board.size();
        int[][] cost = new int[n][n];
        int[][] path = new int[n][n];
        for (int i = 0; i < n; i++)
            Arrays.fill(cost[i], - 1);
        cost[0][0] = 0;
        path[0][0] = 1;
        int[][] dir = {{-1, 0}, {-1, -1}, {0, - 1}};
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                char c = board.get(i).charAt(j);
                if (c == 'E' || c == 'X')
                    continue;
                int max = -1;
                int cnt = 0;
                for (int[] d : dir) {
                    int newi = i + d[0];
                    int newj = j + d[1];
                    if (newi < 0 || newj < 0 || board.get(newi).charAt(newj) == 'X' || path[newi][newj] == 0)
                        continue;
                    if (cost[newi][newj] > max) {
                        max = cost[newi][newj];
                        cnt = path[newi][newj]; 
                    }
                    else if (max == cost[newi][newj])
                        cnt = (cnt + path[newi][newj]) % 1000000007;
                }
                if (cnt == 0)
                    continue;
                int p;
                if (c == 'S')
                    p = 0;
                else
                    p = c - '0';
                cost[i][j] = max + p;
                path[i][j] = cnt;
            }
        if (path[n - 1][n - 1] == 0)
            return new int[] {0,0};
        return new int[] {cost[n - 1][n- 1], path[n - 1][n - 1]};
    }
}
