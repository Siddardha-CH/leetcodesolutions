Given an array of integers arr, find the sum of min(b), where b ranges over every (contiguous) subarray of arr. Since the answer may be large, return the answer modulo 109 + 7.




class Solution {
    public int sumSubarrayMins(int[] arr) {
        // int mod = (int) 1e9 + 7;
        // int ans = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     TreeSet<Integer> t = new TreeSet<>();
        //     for (int j = i; j < arr.length; j++) {
        //         t.add(arr[j]);
        //         ans += t.first();
        //         ans %= mod;
        //     }
        // }
        // return ans;


        //-----------------------TLE---------------------------


        
        
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-03-22                                             #
        #                                                                       #
        #########################################################################
        */
        int[] dp = new int[arr.length];
        int ans = 0;
        int mod = (int) 1e9 + 7;
        Stack <Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i])
                st.pop();
            if (st.isEmpty())
                dp[i] = (i + 1) * arr[i];
            else
                dp[i] = dp[st.peek()] + (i - st.peek()) * arr[i];
            st.push(i);
            ans = (ans + dp[i]) % mod;
        }
        return ans;
     }
}
