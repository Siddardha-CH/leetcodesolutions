Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.



class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-03-28                                             #
        #                                                                       #
        #########################################################################
        */
        ArrayList<Integer> k = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : nums1)
            map.put(i, map.getOrDefault(i, 0) + 1);
        for (int i : nums2) 
            if (map.containsKey(i) && map.get(i) > 0) {
                k.add(i);
                map.put(i, map.get(i) - 1);
            }
        int[] ans = new int[k.size()];
        for (int i = 0; i < ans.length; i++)
            ans[i] = k.get(i);
        return ans;
    }
}
