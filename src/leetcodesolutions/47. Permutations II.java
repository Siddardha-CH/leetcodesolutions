Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.




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
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        func(nums, new ArrayList<>(), new boolean[nums.length]);
        return ans;
    }
    public void func(int[] nums, List<Integer> k, boolean[] used) {
        if (k.size() == nums.length) {
            ans.add(new ArrayList<>(k));
            return;
        }
        for (int i  = 0; i < nums.length; i++) {
            if (used[i])
                continue;
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])
                continue;
            used[i] = true;
            k.add(nums[i]);
            func(nums, k, used);
            used[i] = false;
            k.remove(k.size() - 1);
        }
    }
}
