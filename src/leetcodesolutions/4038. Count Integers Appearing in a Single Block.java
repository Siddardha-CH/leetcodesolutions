You are given an integer array nums.

An integer x is special if all occurrences of x in nums appear in a single contiguous block.

Return the number of distinct special integers in nums






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
        #  Date        : 2026-08-30                                             #
        #                                                                       #
        #########################################################################
        */
    public int countSpecialIntegers(int[] nums) {
        if (nums.length == 1)
            return 1;
        Map<Integer, List<Integer>> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i]))
                map.put(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        int ans = 0;
        for (Map.Entry<Integer, List<Integer>> e : map.entrySet()) {
            boolean b = true;
            List<Integer> l = e.getValue();
            if (l.size() == 1) {
                ans += 1;
                continue;
            }
            int c = l.get(0) + 1;
            for (int i = 1; i < l.size(); i++) {
                if (l.get(i) != c) {
                    b = false;
                    break;
                }
                c += 1;
            }
            if (b)
                ans += 1;
        }
        return ans;
    }
}
