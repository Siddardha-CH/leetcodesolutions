You are given a directed acyclic graph of n nodes numbered from 0 to n − 1. This is represented by a 2D array edges of length m, where edges[i] = [ui, vi, costi] indicates a one‑way communication from node ui to node vi with a recovery cost of costi.

Some nodes may be offline. You are given a boolean array online where online[i] = true means node i is online. Nodes 0 and n − 1 are always online.

A path from 0 to n − 1 is valid if:

All intermediate nodes on the path are online.
The total recovery cost of all edges on the path does not exceed k.
For each valid path, define its score as the minimum edge‑cost along that path.

Return the maximum path score (i.e., the largest minimum-edge cost) among all valid paths. If no valid path exists, return -1.






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
        #  Date        : 2026-07-03                                             #
        #                                                                       #
        #########################################################################
        */
    public int findMaxPathScore(int[][] edges, boolean[] online, long k) {
        int ans = -1;
        int n = online.length;
        Map<Integer, List<int[]>> map = new HashMap<>();
        int l = 1000000;
        int r = 0;
        for (int[] i : edges) {
            int u = i[0];
            int v = i[1];
            int c = i[2];

            if (!online[u] || !online[v])
                continue;
            
            map.computeIfAbsent(u, x -> new ArrayList<>()).add(new int[] {v, c});
            l = Math.min(l, c);
            r = Math.max(r, c);
        }
        while (l <= r) {
            int m = (l + r) / 2;
            if (check (m, n, k, map)) {
                ans = m;
                l = m + 1;
            }
            else
                r = m - 1;
        }
        return ans;
    }
    public boolean check (int m, int n, long k, Map<Integer, List<int[]>> map) {
        long[] res = new long[n];
        Arrays.fill(res, Long.MAX_VALUE);
        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));
        res[0] = 0;
        pq.offer(new long[] {0, 0});
        while (!pq.isEmpty()) {
            long[] t = pq.poll();
            long d = t[0];
            int node = (int) t[1];
            if (d > k)
                return false;
            if (node == n - 1)
                return true;
            if (d > res[node])
                continue;
            for (int[] i : map.getOrDefault(node, List.of())) {
                int adj = i[0];
                int dis = i[1];
                if (dis < m)
                    continue;
                if (d + dis < res[adj]) {
                    res[adj] = d + dis;
                    pq.offer(new long[] {d + dis, adj});
                }
            }
        }
        return false;
    }
}
