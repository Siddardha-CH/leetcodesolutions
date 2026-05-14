You are given an integer array nums. We consider an array good if it is a permutation of an array base[n].

base[n] = [1, 2, ..., n - 1, n, n] (in other words, it is an array of length n + 1 which contains 1 to n - 1 exactly once, plus two occurrences of n). For example, base[1] = [1, 1] and base[3] = [1, 2, 3, 3].

Return true if the given array is good, otherwise return false.

Note: A permutation of integers represents an arrangement of these numbers.





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
        #  Date        : 2026-05-14                                             #
        #                                                                       #
        #########################################################################
        */
    public boolean isGood(int[] nums) {
        int n = nums.length;
        n -= 1;
        int[] k = new int[n];

        for (int i : nums)
            if (i >= nums.length)
                return false;
            else
                k[i - 1] += 1;
        
        for (int i = 0; i < n - 1; i++)
            if (k[i] != 1)
                return false;
        
        if (k[n - 1] != 2)
            return false;
        
        return true;
    }
}
