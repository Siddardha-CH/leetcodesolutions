You are given an array of digits called digits. Your task is to determine the number of distinct three-digit even numbers that can be formed using these digits.

Note: Each copy of a digit can only be used once per number, and there may not be leading zeros.








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
        #  Date        : 2026-11-08                                             #
        #                                                                       #
        #########################################################################
        */
    public int totalNumbers(int[] digits) {
        int ans = 0;
        int[] vis = new int[1000];  //max 9   max 3 digit == 999
        int n = digits.length;
        for (int i = 0; i < n; i++) {
            if (digits[i] == 0)
                continue;
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                for (int k = 0; k < n; k++) {
                    if (i == k || j == k || digits[k] % 2 != 0)
                        continue;
                    int x = digits[i] * 100 + digits[j] * 10 + digits[k];
                    if (vis[x] != 1) {
                        ans += 1;
                        vis[x] = 1;
                    }
                }
            }
        }
        return ans;
   }

}
