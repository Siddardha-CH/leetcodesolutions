There are n cities connected by some number of flights. You are given an array flights where flights[i] = [fromi, toi, pricei] indicates that there is a flight from city fromi to city toi with cost pricei.

You are also given three integers src, dst, and k, return the cheapest price from src to dst with at most k stops. If there is no such route, return -1.





class Solution {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                      #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                      #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                     #
        #  Description : Solution / Code / Project                                #
        #  Date        : 2026-24-11                                               #
        #                                                                       #
        #########################################################################
        */
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer, List<int[]>> map = new HashMap<>();
        for (int[] i : flights) {
            if (!map.containsKey(i[0]))
                map.put(i[0], new ArrayList<>());
            map.get(i[0]).add(new int[]{i[1], i[2]});
        }
        Map<String, Integer> dis = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        pq.offer(new int[]{0, src, 0});
        dis.put(src + "-" + 0, 0);
        while (!pq.isEmpty()) {
            int[] kk = pq.poll();
            int cost = kk[0];
            int curr = kk[1];
            int stops = kk[2];
            if (curr == dst)
                return cost;
            if (stops > k)
                continue;
            String key = curr + "-" + stops;
            if (!dis.containsKey(key) || dis.get(key) < cost)
                continue;
            for (int[] nei : map.getOrDefault(curr, new ArrayList<>())) {
                int newcost = cost + nei[1];
                int newstops = stops + 1;
                String newkey = nei[0] + "-" + newstops;
                if (newcost < dis.getOrDefault(newkey, Integer.MAX_VALUE)) {
                    dis.put(newkey, newcost);
                    pq.offer(new int[]{newcost, nei[0], newstops});
                }  
            }
        }
        return -1;
    }
}
