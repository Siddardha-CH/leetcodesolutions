You are given a 0-indexed array of n integers arr.

The interval between two elements in arr is defined as the absolute difference between their indices. More formally, the interval between arr[i] and arr[j] is |i - j|.

Return an array intervals of length n where intervals[i] is the sum of intervals between arr[i] and each element in arr with the same value as arr[i].

Note: |x| is the absolute value of x.





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
        #  Date        : 2026-04-23                                             #
        #                                                                       #
        #########################################################################
        */
    public long[] getDistances(int[] arr) {
        int n = arr.length;
        long[] ans = new long[n];

        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++)
            if (map.containsKey(arr[i]))
                map.get(arr[i]).add(i);
            else {
                ArrayList<Integer> k = new ArrayList<>();
                k.add(i);
                map.put(arr[i], k);
            } 
        
        for (ArrayList<Integer> l : map.values()) {
            long tot = 0;
            for (int i : l)
                tot += i;

            long prefix = 0;
            int s = l.size();
            for (int i = 0; i < s; i++) {
                int index = l.get(i);
                long left = (long) index * i - prefix;
                long right = (tot - prefix - index) - (long) (s - i - 1) * index;
                ans[index] = left + right;
                prefix += index;
            }
        }
        return ans;
    }
}
