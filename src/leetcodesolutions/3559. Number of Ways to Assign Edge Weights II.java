There is an undirected tree with n nodes labeled from 1 to n, rooted at node 1. The tree is represented by a 2D integer array edges of length n - 1, where edges[i] = [ui, vi] indicates that there is an edge between nodes ui and vi.

Initially, all edges have a weight of 0. You must assign each edge a weight of either 1 or 2.

The cost of a path between any two nodes u and v is the total weight of all edges in the path connecting them.

You are given a 2D integer array queries. For each queries[i] = [ui, vi], determine the number of ways to assign weights to edges in the path such that the cost of the path between ui and vi is odd.

Return an array answer, where answer[i] is the number of valid assignments for queries[i].

Since the answer may be large, apply modulo 109 + 7 to each answer[i].

Note: For each query, disregard all edges not in the path between node ui and vi.






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
        #  Date        : 2026-06-12                                             #
        #                                                                       #
        #########################################################################
        */
    public int[] assignEdgeWeights(int[][] edges, int[][] queries) {
        int n = edges.length + 1;   // as total edges are 1 to n len is n - 1
        int[] ans = new int[queries.length];

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());
        
        for (int[] i : edges) {     // build tree
            int x = i[0] - 1;
            int y = i[1] - 1;
            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        int[] depth = new int[n];
        String s = Integer.toBinaryString(n);
        int maxbits = s.length();
        int[][] at = new int[n][maxbits];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < maxbits; j++)
                at[i][j] = -1;
        
        dfs(depth, graph, at, 0, -1);

        for (int i = 1; i < maxbits; i++)
            for (int j = 0; j < n; j++)
                if (at[j][i - 1] != -1)
                    at[j][i] = at[at[j][i - 1]][i - 1];

        long[] pow = new long[n + 1];
        pow[0] = 1;
        for (int i = 1; i < n + 1; i++)
            pow[i] = (pow[i - 1] * 2) % 1000000007;

        for (int i = 0; i < queries.length; i++) {
            int x = queries[i][0] - 1;
            int y = queries[i][1] - 1;

            int common = depth[lca(x, y, depth, at, maxbits)];
            common *= 2;        // as distance is counted for both nodes
            int d = depth[x] + depth[y] - common;

            if (d == 0)
                ans[i] = 0;
            else
                ans[i] = (int) pow[d - 1];
        }
        return ans;
    }
    public void dfs(int[] depth, List<List<Integer>> graph, int[][] at, int curr, int parent) {
        at[curr][0] = parent;

        for (int i : graph.get(curr)) {
            if (i == parent)
                continue;
            depth[i] = depth[curr] + 1;
            dfs(depth, graph, at, i, curr);
        }
    }

    public int lca(int x, int y, int[] depth, int[][] at, int n)  {
        if (depth[x] < depth[y]) {
            int t = y;
            y = x;
            x = t;
        } 

        int k = depth[x] - depth[y];

        int j = 0;
        while (k > 0) {
            if (k % 2 == 1)
                x = at[x][j];
            k /= 2;
            j += 1;
        }
        if (x == y)
            return x;

        for (int i = n - 1; i>= 0; i--) {
            if (at[x][i] == -1)
                continue;
            if (at[x][i] != at[y][i]) {
                x = at[x][i];
                y = at[y][i];
            }
        }
        return at[x][0];
    } 
}
