Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.






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
        #  Date        : 2026-08-27                                             #
        #                                                                       #
        #########################################################################
        */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        func(0, ans, nums, new ArrayList<>());
        return ans;
    }
    public void func(int i, List<List<Integer>> ans, int[] nums, List<Integer> p) {
        ans.add(new ArrayList<>(p));
        for (int j = i; j < nums.length; j++) {
            p.add(nums[j]);
            func(j + 1, ans, nums, p);
            p.remove(p.size() - 1);
        }
    }
}
