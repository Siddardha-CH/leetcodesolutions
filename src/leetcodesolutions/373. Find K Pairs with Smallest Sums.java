You are given two integer arrays nums1 and nums2 sorted in non-decreasing order and an integer k.

Define a pair (u, v) which consists of one element from the first array and one element from the second array.

Return the k pairs (u1, v1), (u2, v2), ..., (uk, vk) with the smallest sums.




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
        #  Date        : 2026-06-13                                             #
        #                                                                       #
        #########################################################################
        */
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int c) {
        List<List<Integer>> ans = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        Set<String> visited = new HashSet<>();
        pq.offer(new int[]{nums1[0] + nums2[0], 0, 0});
        visited.add("0-0");

        while (c > 0 && !pq.isEmpty()) {
            int[] i = pq.poll();
            int x = i[1];
            int y = i[2];
            ArrayList<Integer> k = new ArrayList<>();
            k.add(nums1[x]);
            k.add(nums2[y]);
            ans.add(k);
            if (nums1.length > x + 1) {
                String kk = (x + 1) + "-" + y;
                if (!visited.contains(kk)) {
                    int[] nn = new int[3];
                    nn[0] = nums1[x + 1] + nums2[y];
                    nn[1] = x + 1;
                    nn[2] = y;
                    pq.add(nn);
                    visited.add(kk);
                }
            }
            if (nums2.length > y + 1) {
                String kk = (x) + "-" + (y + 1);
                if (!visited.contains(kk)) {
                    int[] nn = new int[3];
                    nn[0] = nums1[x] + nums2[y + 1];
                    nn[1] = x;
                    nn[2] = y + 1;
                    pq.add(nn);
                    visited.add(kk);
                }
            }
            c -= 1;
        } 
        return ans;
    }
}
