Given an array of integers arr, replace each element with its rank.

The rank represents how large the element is. The rank has the following rules:

Rank is an integer starting from 1.
The larger the element, the larger the rank. If two elements are equal, their rank must be the same.
Rank should be as small as possible.








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
        #  Date        : 2026-07-12                                             #
        #                                                                       #
        #########################################################################
        */
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int[] p = Arrays.copyOf(arr, n);
        Arrays.sort(p);
        Map<Integer, Integer> map = new HashMap<>();
        int a = 1;
        for (int i : p)
            if (map.containsKey(i))
                map.put(i, map.get(i));
            else
                map.put(i, a++);
        for (int i = 0; i <n; i++)
            ans[i] = map.get(arr[i]);
        return ans;
    }
}
