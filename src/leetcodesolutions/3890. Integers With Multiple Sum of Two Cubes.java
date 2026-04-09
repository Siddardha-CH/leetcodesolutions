You are given an integer n.

An integer x is considered good if there exist at least two distinct pairs (a, b) such that:

a and b are positive integers.
a <= b
x = a3 + b3
Return an array containing all good integers less than or equal to n, sorted in ascending order.



class Solution {
    public List<Integer> findGoodIntegers(int n) {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-04-09                                             #
        #                                                                       #
        #########################################################################
        */
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int k = (int) Math.cbrt(n);
        for (int i = 1; i <= k; i++) {
            int s = i * i * i;
            for (int j = i; j <= k; j++) {
                int l = s + (j * j * j);
                if (l > n)
                    break;
                map.put(l, map.getOrDefault(l, 0) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet())
            if (e.getValue() > 1)
                ans.add(e.getKey());
        
        Collections.sort(ans);

        return ans;
    }
}
