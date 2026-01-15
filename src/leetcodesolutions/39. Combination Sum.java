// Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

// The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.

// The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

 ---------------------------------------SOLUTION------------------------------------------




   class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        comb(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    public void comb(int i, int[] c, int t, List<List<Integer>> ans, ArrayList<Integer> d) {
        if (i == c.length) {
            if (t == 0)
                ans.add(new ArrayList<>(d));
            return;
        }
        if (c[i] <= t) {
            d.add(c[i]);
            comb(i,c,t - c[i],ans,d);
            d.remove(d.size() - 1);
        }
        comb(i + 1,c,t,ans,d);
    }
}
