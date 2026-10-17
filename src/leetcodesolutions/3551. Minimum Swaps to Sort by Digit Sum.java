You are given an array nums of distinct positive integers. You need to sort the array in increasing order based on the sum of the digits of each number. If two numbers have the same digit sum, the smaller number appears first in the sorted order.

Return the minimum number of swaps required to rearrange nums into this sorted order.

A swap is defined as exchanging the values at two distinct positions in the array.






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
        #  Date        : 2026-17-10                                             #
        #                                                                       #
        #########################################################################
        */
    public int minSwaps(int[] nums) {
        int ans = 0;
        int n = nums.length;
        Integer[] nums1 = new Integer[n];
        for (int i = 0; i < n; i++)
            nums1[i] = nums[i];
            Arrays.sort(nums1, (a, b) -> {
                int n1 = digsum(a);
                int n2 = digsum(b);
                if (n1 != n2)
                    return Integer.compare(n1, n2);
                return Integer.compare(a, b);
            });
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++)
            map.put(nums[i], i);
        for (int i = 0; i < n; i++) {
            int expected = nums1[i];
            int curr = nums[i];
            if (curr == expected)
                continue;
            ans += 1;
            int idx = map.get(expected);
            nums[i] = expected;
            nums[idx] = curr;
            map.put(curr, idx);
            map.put(expected, i);
        }
        return ans;
    }
    public int digsum(int n ) {
        int k = 0;
        while (n > 0) {
            int t = n % 10;
            k += t;
            n /= 10;
        }
        return k;
    }
}
