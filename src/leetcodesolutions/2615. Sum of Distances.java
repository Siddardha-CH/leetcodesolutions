You are given a 0-indexed integer array nums. There exists an array arr of length nums.length, where arr[i] is the sum of |i - j| over all j such that nums[j] == nums[i] and j != i. If there is no such j, set arr[i] to be 0.

Return the array arr.




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
        #  Date        : 2026-04-23                                             #
        #                                                                       #
        #########################################################################
        */
    public long[] distance(int[] nums) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        int n = nums.length;
        long[] ans = new long[n];

        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i]))
                map.get(nums[i]).add(i);
            else {
                ArrayList<Integer> k = new ArrayList<>();
                k.add(i);
                map.put(nums[i], k);
            }
        }

        // for (int i = 0; i < n; i++) {
        //     if (map.get(nums[i]).size() == 1)
        //         ans[i] = 0;
        //     else {
        //         long len = 0;                                        PRODUCES TLE
        //         ArrayList<Integer> k = map.get(nums[i]);
        //         for (int j : k) 
        //             len += (long)Math.abs(i - j);
                
        //         ans[i] = len;
        //     }
        // }

        

        /* 
        For each index, we need the sum of distances to all indices having the same value. Instead of calculating distances one by one (which is slow), we optimize using prefix sums.

        First, group all indices having the same value. For each group, process indices in sorted order.

        At any index idx = list[i], split the total distance into two parts:

        1. Left side (elements before current index):
        All elements on the left are smaller, so distance is:
        (idx - a) for each element a on left

        This can be rewritten as:
        left = idx * i - sum of left elements

        Here:
        i = number of elements on the left
        sum of left elements = prefixSum

        2. Right side (elements after current index):
        All elements on the right are larger, so distance is:
        (a - idx) for each element a on right

        This becomes:
        right = sum of right elements - idx * count of right elements

        We compute right sum as:
        sum of right = totalSum - prefixSum - idx

        So:
        right = (totalSum - prefixSum - idx) - (size - i - 1) * idx

        3. Final Answer:
        ans[idx] = left + right
        */

        
        for (ArrayList<Integer> l : map.values()) {
            int s = l.size();
            long tot = 0;
            for (int i : l)
                tot += i;

            long prefixsum = 0;

            for (int i = 0; i < s; i++) {

                int index = l.get(i);

                long left = (long) index * i - prefixsum;
                long right = (tot - index - prefixsum) - (long) (s - i - 1) * index;

                ans[index] = left + right;

                prefixsum += index;
            }
        }


        return ans;
    }
}
