You are given an array of positive integers nums.

You need to select a subset of nums which satisfies the following condition:

You can place the selected elements in a 0-indexed array such that it follows the pattern: [x, x2, x4, ..., xk/2, xk, xk/2, ..., x4, x2, x] (Note that k can be be any non-negative power of 2). For example, [2, 4, 16, 4, 2] and [3, 9, 3] follow the pattern while [2, 4, 8, 4, 2] does not.
Return the maximum number of elements in a subset that satisfies these conditions.





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
        #  Date        : 2026-06-28                                             #
        #                                                                       #
        #########################################################################
        */
    public int maximumLength(int[] nums) {
        int ans = 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums)
            map.put(i, map.getOrDefault(i, 0) + 1);


        if (map.containsKey(1)) {
            int cnt = map.get(1);
            ans = (cnt % 2 == 0) ? cnt - 1 : cnt;
        }
        map.remove(1);
        // for (int i = 2; i < 31624; i++) {
        //     int c = i;
        //     int s = 0;
        //     while (map.containsKey(c) && map.get(c) > 1) {
        //         c *= c;
                
        //         s += 2;
        //         if (c >= 31624)
        //             break;
        //     }
        //     if (map.containsKey(c))
        //         s += 1;
        //     else if (s > 0)
        //         s -= 1;
        //     ans = Math.max(ans, s);
        // }

        for (int i : map.keySet()) {
            int c = i;
            int s = 0;
            while (map.containsKey(c) && map.get(c) > 1) {
                c *= c;
                s += 2;
                if (c >= 31624)
                    break;
            }
            if (map.containsKey(c))
                s += 1;
            else 
                s -= 1;
                ans = Math.max(ans, s);
        }

        return ans;
    }
}
