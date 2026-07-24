You are given an integer array nums.

A XOR triplet is defined as the XOR of three elements nums[i] XOR nums[j] XOR nums[k] where i <= j <= k.

Return the number of unique XOR triplet values from all possible triplets (i, j, k).





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
        #  Date        : 2026-07-24                                             #
        #                                                                       #
        #########################################################################
        */
    public int uniqueXorTriplets(int[] nums) {
        // Set<Integer> k = new HashSet<>();
        // Set<Integer> ans = new HashSet<>();
        // for (int i : nums)
        //     for (int j : nums)
        //         k.add(i ^ j);
        // for (int i : k)
        //     for (int j : nums)
        //         ans.add(i ^ j);
        // return ans.size();
        //set is taking longer so tle

        int[] k = new int[2048];
        int[] kk = new int[2048];
        for (int i : nums)
            for (int j : nums)
                k[i ^ j] = 1;
        for (int i = 0; i < 2048; i++)
            for (int j : nums)
                if (k[i] == 1)
                    kk[i ^ j] = 1;
        int ans = 0;
        for (int i : kk)
            if (i == 1)
                ans += 1;
        return ans;
    }
}
