In this problem, a tree is an undirected graph that is connected and has no cycles.

You are given a graph that started as a tree with n nodes labeled from 1 to n, with one additional edge added. The added edge has two different vertices chosen from 1 to n, and was not an edge that already existed. The graph is represented as an array edges of length n where edges[i] = [ai, bi] indicates that there is an edge between nodes ai and bi in the graph.

Return an edge that can be removed so that the resulting graph is a tree of n nodes. If there are multiple answers, return the answer that occurs last in the input.






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
        #  Date        : 2026-15-10                                             #
        #                                                                       #
        #########################################################################
        */
    public int[] findRedundantConnection(int[][] edges) {
        List<List<Integer>> list = new ArrayList<>();
        int n = edges.length + 1;
        for (int i = 0; i < n; i++)
            list.add(new ArrayList<>());
        for (int[] i : edges) {
            list.get(i[0]).add(i[1]);
            list.get(i[1]).add(i[0]);
        }
        for (int i = edges.length - 1; i>= 0; i--) {
            int u = edges[i][0];
            int v = edges[i][1];
            list.get(u).remove(Integer.valueOf(v));
            list.get(v).remove(Integer.valueOf(u));
            boolean[] seen = new boolean[n];
            dfs(u, list, seen);
            boolean b = true;
            for (int j = 1; j < n; j++)
                if (!seen[j]) {
                    b = false;
                    break;
                }         
            if (b)
                return edges[i];
            list.get(u).add(v);
            list.get(v).add(u);       
        }
        return new int[]{};
    }
    public void dfs(int node, List<List<Integer>> list, boolean[] seen) {
        seen[node] = true;
        for (int i : list.get(node))
            if (!seen[i])
                dfs(i, list, seen);
    }
}
