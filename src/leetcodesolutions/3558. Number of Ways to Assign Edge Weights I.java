There is an undirected tree with n nodes labeled from 1 to n, rooted at node 1. The tree is represented by a 2D integer array edges of length n - 1, where edges[i] = [ui, vi] indicates that there is an edge between nodes ui and vi.

Initially, all edges have a weight of 0. You must assign each edge a weight of either 1 or 2.

The cost of a path between any two nodes u and v is the total weight of all edges in the path connecting them.

Select any one node x at the maximum depth. Return the number of ways to assign edge weights in the path from node 1 to x such that its total cost is odd.

Since the answer may be large, return it modulo 109 + 7.

Note: Ignore all edges not in the path from node 1 to x.





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
        #  Date        : 2026-06-11                                             #
        #                                                                       #
        #########################################################################
        */
    public int assignEdgeWeights(int[][] edges) {
        Map<Integer, Set<Integer>> map = new HashMap<>();

        for (int[] i : edges) {
            int m = i[0];
            int n = i[1];

            if (map.containsKey(m))
                map.get(m).add(n);
            else {
                Set<Integer> k = new HashSet<>();
                k.add(n);
                map.put(m, k);
            }
            if (map.containsKey(n))
                map.get(n).add(m);
            else {
                Set<Integer> k = new HashSet<>();
                k.add(m);
                map.put(n, k);
            }
        }

        int dep = dfs(map, 1, -1);

        long ans = 1;
        for (int i = 1; i < dep; i++) {         // why till dep - 1 coz we are looking for only odd which are eactly half of total
            ans = (ans  * 2) % 1_000_000_007L;
        }

        return (int) ans;
    }

    public int dfs(Map<Integer, Set<Integer>> map, int cur, int par) {
        int md = 0;
        for (int i : map.get(cur)) {
            if (i != par) {
                int d = 1 + dfs(map, i, cur);
                md = Math.max(md, d);
            }
        }
        return md;
    }
}
