You are given an array of integers arr and an integer target.

You have to find two non-overlapping sub-arrays of arr each with a sum equal target. There can be multiple answers so you have to find an answer where the sum of the lengths of the two sub-arrays is minimum.

Return the minimum sum of the lengths of the two required sub-arrays, or return -1 if you cannot find such two sub-arrays.





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
        #  Date        : 2026-17-08                                             #
        #                                                                       #
        #########################################################################
        */
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int i = 0;
        int j = 0;
        int ans = Integer.MAX_VALUE;
        int[] bestmin = new int[n];
        Arrays.fill(bestmin, Integer.MAX_VALUE);
        int min = Integer.MAX_VALUE;
        int curr = 0;
        while (j < n) {
            curr += arr[j];
            while (curr > target)
                curr -= arr[i++];
            if (curr == target) {
                int len = j - i + 1;
                if (i > 0 && bestmin[i - 1] != Integer.MAX_VALUE)
                    ans = Math.min(ans, len + bestmin[i - 1]);
                min = Math.min(min, len);
            }
            
            bestmin[j] = min;
            j += 1;
        } 
        if (ans == Integer.MAX_VALUE)
            return -1;
        return ans;
    }
}
