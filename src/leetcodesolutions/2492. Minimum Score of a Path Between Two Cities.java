You are given a positive integer n representing n cities numbered from 1 to n. You are also given a 2D array roads where roads[i] = [ai, bi, distancei] indicates that there is a bidirectional road between cities ai and bi with a distance equal to distancei. The cities graph is not necessarily connected.

The score of a path between two cities is defined as the minimum distance of a road in this path.

Return the minimum possible score of a path between cities 1 and n.

Note:

A path is a sequence of roads between two cities.
It is allowed for a path to contain the same road multiple times, and you can visit cities 1 and n multiple times along the path.
The test cases are generated such that there is at least one path between 1 and n.






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
        #  Date        : 2026-07-04                                             #
        #                                                                       #
        #########################################################################
        */
    int ans = 100000;
    public int minScore(int n, int[][] roads) {
        Map<Integer, List<int[]>> map = new HashMap<>();
        for (int[] i : roads) {
            int u = i[0];
            int v = i[1];
            int c = i[2];
            map.computeIfAbsent(u, x -> new ArrayList<>()).add(new int[]{v, c});            // bi-directional so u to v and v to u
            map.computeIfAbsent(v, x -> new ArrayList<>()).add(new int[]{u, c});
        }
        boolean[] visited = new boolean[n + 1];
        dfs(1, map, visited);
        return ans;
    }
    public void dfs(int node, Map<Integer, List<int[]>> map, boolean[] visited) {
        visited[node] = true;
        for (int[] i : map.getOrDefault(node, new ArrayList<>())) {
            int adj = i[0];
            int c = i[1];
            ans = Math.min(ans, c);
            if (!visited[adj])
                dfs(adj, map, visited);
        }
    }
}
