You are given two integer arrays, source and target, both of length n. You are also given an array allowedSwaps where each allowedSwaps[i] = [ai, bi] indicates that you are allowed to swap the elements at index ai and index bi (0-indexed) of array source. Note that you can swap elements at a specific pair of indices multiple times and in any order.

The Hamming distance of two arrays of the same length, source and target, is the number of positions where the elements are different. Formally, it is the number of indices i for 0 <= i <= n-1 where source[i] != target[i] (0-indexed).

Return the minimum Hamming distance of source and target after performing any amount of swap operations on array source.




class Solution {
    public int minimumHammingDistance(int[] source, int[] target, int[][] allowedSwaps) {
         /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-04-21                                             #
        #                                                                       #
        #########################################################################
        */

        int n = source.length;
        int ans = 0;
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());

        for (int[] i : allowedSwaps) {
            graph.get(i[0]).add(i[1]);
            graph.get(i[1]).add(i[0]);
        }

        int[] visited = new int[n];

        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                List<Integer> conn = new ArrayList<>();

                dfs(graph, visited, conn, i);

                Map<Integer, Integer> map = new HashMap<>();

                for (int j : conn) 
                    map.put(source[j], map.getOrDefault(source[j], 0) + 1); 
                
                for (int j : conn) 
                    if (map.getOrDefault(target[j], 0) >= 1)
                        map.put(target[j], map.get(target[j]) - 1);
                    else
                        ans += 1;
                
            }
        }
        return ans;
    }
    public void dfs(List<List<Integer>> graph, int[] visited, List<Integer> conn, int idx) {
        visited[idx] = 1;
        conn.add(idx);
        for (int i : graph.get(idx))
            if (visited[i] == 0)
                dfs(graph, visited, conn, i);
    }
}
