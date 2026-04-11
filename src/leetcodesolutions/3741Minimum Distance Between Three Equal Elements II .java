You are given an integer array nums.

A tuple (i, j, k) of 3 distinct indices is good if nums[i] == nums[j] == nums[k].

The distance of a good tuple is abs(i - j) + abs(j - k) + abs(k - i), where abs(x) denotes the absolute value of x.

Return an integer denoting the minimum possible distance of a good tuple. If no good tuples exist, return -1.




class Solution {
    public int minimumDistance(int[] nums) {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-04-11                                             #
        #                                                                       #
        #########################################################################
        */
        Map<Integer, List<Integer>> map = new HashMap<>();
        int ans = 99999999;

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i]))
                map.put(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }

        for (List<Integer> l : map.values())
            if (l.size() > 2) 
                for (int i = 0; i < l.size() - 2; i++)
                    ans = Math.min(ans, 2 * (l.get(i + 2) - l.get(i)));
        if (ans == 99999999)
            return -1;
        return ans;
    }
}
