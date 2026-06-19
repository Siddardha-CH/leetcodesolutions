A conveyor belt has packages that must be shipped from one port to another within days days.

The ith package on the conveyor belt has a weight of weights[i]. Each day, we load the ship with packages on the conveyor belt (in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.

Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.






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
        #  Date        : 2026-06-19                                             #
        #                                                                       #
        #########################################################################
        */
    public int shipWithinDays(int[] nums, int k) {
        int high = 0;
        int low = 0;
        for (int i : nums) {
            low = Math.max(low, i);
            high += i;
        }
        while (high >= low) {
            int mid = (high + low) / 2;
            int p = func(nums, mid);
            if (p > k) 
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }

    public int func(int[] nums, int range) {
        int c = 1;
        int s = 0;
        for (int i : nums) {
            if (s + i <= range)
                s += i;
            else {
                c += 1;
                s = i;
            }
        }
        return c;
    }
}
