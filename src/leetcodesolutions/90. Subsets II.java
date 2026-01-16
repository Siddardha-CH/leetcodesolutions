// Given an integer array nums that may contain duplicates, return all possible subsets (the power set).

// The solution set must not contain duplicate subsets. Return the solution in any order.

 --------------------------------SOLUTION----------------------------------------


class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        sbs(0,ans,new ArrayList<>(),nums);
        return ans;
    }
    public void sbs(int i, List<List<Integer>> ans,List<Integer> sub,int[] nums) {
        if (i == nums.length) {
            ans.add(new ArrayList<>(sub));
            return;
        }
        sub.add(nums[i]);
        sbs(i + 1,ans,sub,nums);
        sub.remove(sub.size() - 1);
        while (i + 1 < nums.length && nums[i] == nums[i + 1])
            i += 1;
        sbs(i + 1,ans,sub,nums);
    }
}
