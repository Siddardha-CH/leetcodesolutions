You are given a network of n nodes, labeled from 1 to n. You are also given times, a list of travel times as directed edges times[i] = (ui, vi, wi), where ui is the source node, vi is the target node, and wi is the time it takes for a signal to travel from source to target.

We will send a signal from a given node k. Return the minimum time it takes for all the n nodes to receive the signal. If it is impossible for all the n nodes to receive the signal, return -1.





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
        #  Date        : 2026-19-10                                             #
        #                                                                       #
        #########################################################################
        */
    public int networkDelayTime(int[][] times, int n, int k) {
        int ans = 0;
        Map<Integer, List<int[]>aaw> map = new HashMap<>();
        for (int[] i : times) {
            int u = i[0];
            int v = i[1];
            int w = i[2];
            if (!map.containsKey(u))
                map.put(u, new ArrayList<>());
            map.get(u).add(new int[]{v, w});
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        pq.offer(new int[]{0, k});
        Set<Integer> seen = new HashSet<>();
        while (!pq.isEmpty()) {
            int[] temp = pq.poll();
            int w = temp[0];
            int d = temp[1];
            if (seen.contains(d))
                continue;
            ans = Math.max(ans, w);
            seen.add(d);
            if (!map.containsKey(d))
                continue;
            for (int[] i : map.get(d)) {
                int d2 = i[0];
                int w2 = i[1];
                pq.offer(new int[]{w + w2, d2});
            }
        }
        if (seen.size() == n)
            return ans;
        return -1;
    }
}
