You are given two categories of theme park attractions: land rides and water rides.

Land rides
landStartTime[i] – the earliest time the ith land ride can be boarded.
landDuration[i] – how long the ith land ride lasts.
Water rides
waterStartTime[j] – the earliest time the jth water ride can be boarded.
waterDuration[j] – how long the jth water ride lasts.
A tourist must experience exactly one ride from each category, in either order.

A ride may be started at its opening time or any later moment.
If a ride is started at time t, it finishes at time t + duration.
Immediately after finishing one ride the tourist may board the other (if it is already open) or wait until it opens.
Return the earliest possible time at which the tourist can finish both rides.




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
        #  Date        : 2026-06-03                                             #
        #                                                                       #
        #########################################################################
        */
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {

        // land ---> water
        int minland = Integer.MAX_VALUE;

        for (int i = 0; i < landStartTime.length; i++)
            minland = Math.min(minland, landStartTime[i] + landDuration[i]);

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < waterStartTime.length; i++)
            ans = Math.min(ans, Math.max(minland, waterStartTime[i]) + waterDuration[i]);


        // water --> land

        int minwater = Integer.MAX_VALUE;

        for (int i = 0; i < waterStartTime.length; i++)
            minwater = Math.min(minwater, waterStartTime[i] + waterDuration[i]);

        for (int i = 0; i < landStartTime.length; i++)
            ans = Math.min(ans, Math.max(minwater, landStartTime[i]) + landDuration[i]);

        return ans;
    }
}
