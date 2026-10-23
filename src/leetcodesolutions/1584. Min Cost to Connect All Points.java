You are given an array points representing integer coordinates of some points on a 2D-plane, where points[i] = [xi, yi].

The cost of connecting two points [xi, yi] and [xj, yj] is the manhattan distance between them: |xi - xj| + |yi - yj|, where |val| denotes the absolute value of val.

Return the minimum cost to make all points connected. All points are connected if there is exactly one simple path between any two points.





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
        #  Date        : 2026-23-10                                               #
        #                                                                       #
        #########################################################################
        */
    public int minCostConnectPoints(int[][] points) {
        int ans = 0;
        int n = points.length;
        Map<Integer, List<int[]>> map = new HashMap<>();
        for (int i = 0; i < n; i++)
            map.put(i, new ArrayList<>());
        for (int i = 0; i < n; i++) {
            int ax = points[i][0];
            int ay = points[i][1];
            for (int j = i + 1; j < n; j++) {
                int bx = points[j][0];
                int by = points[j][1];
                int dis = Math.abs(ax - bx) + Math.abs(ay - by);
                map.get(i).add(new int[]{dis, j});
                map.get(j).add(new int[]{dis, i});
            }
        }
        Set<Integer> set = new HashSet<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        pq.offer(new int[]{0, 0}); //node 0 and cost 0;

        while (set.size() < n) {
            int[] curr = pq.poll();
            int cost = curr[0];
            int des = curr[1];
            if (set.contains(des))
                continue;
            set.add(des);
            ans += cost;
            for (int[] i : map.get(des)) 
                if (!set.contains(i[1])) 
                    pq.offer(i);
        }
        return ans;
    }
}
