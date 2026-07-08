You are given a string s of length m consisting of digits. You are also given a 2D integer array queries, where queries[i] = [li, ri].

For each queries[i], extract the substring s[li..ri]. Then, perform the following:

Form a new integer x by concatenating all the non-zero digits from the substring in their original order. If there are no non-zero digits, x = 0.
Let sum be the sum of digits in x. The answer is x * sum.
Return an array of integers answer where answer[i] is the answer to the ith query.

Since the answers may be very large, return them modulo 109 + 7.



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
        #  Date        : 2026-07-08                                             #
        #                                                                       #
        #########################################################################
        */
    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();
        int[] non0 = new int[n];
        long[] val = new long[n];
        long[] digsum = new long[n];
        long[] pow = new long[n + 1];
        pow[0] = 1;
        for (int i = 1; i <= n; i++)
            pow[i] = (pow[i - 1] * 10) %  1000000007L;
        if (s.charAt(0) != '0')
            non0[0] = 1;
        else
            non0[0] = 0;
        for (int i = 1; i < n; i++) {
            non0[i] = non0[i - 1];
            if (s.charAt(i) != '0')
                non0[i]++;
        }
        val[0] = s.charAt(0) - '0';
        digsum[0] = s.charAt(0) - '0';
        for (int i = 1; i < n; i++)
            digsum[i] = digsum[i - 1] + (s.charAt(i) - '0');
        for (int i = 1; i < n; i++) {
            int dig = s.charAt(i) - '0';
            if (dig != 0)
                val[i] = (val[i - 1] * 10 + dig) % 1000000007L;
            else
                val[i] = val[i - 1];
        }
        int m = queries.length;
        int[] ans = new int[m];
        int idx = -1;
        for (int[] i : queries) {
            idx += 1;
            int l = i[0];
            int r = i[1];
            int cnt;
            long sum;
            if (l == 0) {
                cnt = 0;
                sum = 0;
            }
            else {
                cnt = non0[l - 1];
                sum = val[l - 1];
            }
            int end = non0[r];
            int len = end - cnt;
            if (len == 0) {
                ans[idx] = 0;
                continue;
            }
            long x = (val[r] - (sum * pow[len] % 1000000007L) + 1000000007L) % 1000000007L;
            long ss;
            if (l == 0)
                ss = digsum[r];
            else
                ss = digsum[r] - digsum[l - 1];
            ans[idx] = (int) ((x * ss) % 1000000007L);
        }
        return  ans;
    }
}

