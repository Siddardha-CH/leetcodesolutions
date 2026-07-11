You are given an integer n. There is an undirected graph with n vertices, numbered from 0 to n - 1. You are given a 2D integer array edges where edges[i] = [ai, bi] denotes that there exists an undirected edge connecting vertices ai and bi.

Return the number of complete connected components of the graph.

A connected component is a subgraph of a graph in which there exists a path between any two vertices, and no vertex of the subgraph shares an edge with a vertex outside of the subgraph.

A connected component is said to be complete if there exists an edge between every pair of its vertices.

 



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
        #  Date        : 2026-07-11                                             #
        #                                                                       #
        #########################################################################
        */
        int node = 0;
        int d = 0;
    public int countCompleteComponents(int n, int[][] edges) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        int ans = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            map.put(i, new ArrayList<>());
        }
        for (int[] i : edges) {
            map.get(i[0]).add(i[1]);
            map.get(i[1]).add(i[0]);
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                node = 0;
                d = 0;
                dfs(i, visited, map);
                int c = d / 2;
                if (c == (node * (node - 1) / 2))
                    ans += 1;
            }
        }
        return ans;
    }
    public void dfs(int i, boolean[] visited, Map<Integer, ArrayList<Integer>> map) {
        visited[i] = true;
        node += 1;
        d += map.get(i).size();
        for (int j : map.get(i))
            if (!visited[j])
                dfs(j, visited, map);
    }
}
