You are given a 0-indexed array of positive integers nums and a positive integer limit.

In one operation, you can choose any two indices i and j and swap nums[i] and nums[j] if |nums[i] - nums[j]| <= limit.

Return the lexicographically smallest array that can be obtained by performing the operation any number of times.

An array a is lexicographically smaller than an array b if in the first position where a and b differ, array a has an element that is less than the corresponding element in b. For example, the array [2,10,3] is lexicographically smaller than the array [10,2,3] because they differ at index 0 and 2 < 10






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
        #  Date        : 2026-08-29                                             #
        #                                                                       #
        #########################################################################
        */
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> k = new ArrayList<>();
        int[] l = nums.clone();
        Arrays.sort(l);
        int n = nums.length;
        boolean b = true;

        // adding groups
        for (int i = 1; i < n; i++) {
            if (l[i] - l[i - 1] <= limit) {
                if (b) {
                    k.add(l[i - 1]);
                    b = false;
                }
                k.add(l[i]);
            }
            else {
                if (k.size() > 0)
                    list.add(k);
                b = true;
                k = new ArrayList<>();
            }
        }
        if (k.size() > 0)
            list.add(k);
        
        // final appraoch
        int[] ans = nums.clone();
        boolean[] used = new boolean[n];
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(nums[i]))
                map.put(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        } 
        for (List<Integer> grup : list) {
            List<Integer> idx = new ArrayList<>();
            for (int i : grup)
                idx.add(map.get(i).remove(0));
            Collections.sort(idx);
            for (int i= 0; i < grup.size(); i++)
                ans[idx.get(i)] = grup.get(i);
        }
        return ans;
    }
}
