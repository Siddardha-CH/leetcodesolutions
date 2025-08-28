// You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.

// You can either start from the step with index 0, or the step with index 1.

// Return the minimum cost to reach the top of the floor.

------------------------------------------------------------------------------



  class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] ans = new int[cost.length];
        ans[0] = cost[0];
        ans[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            ans[i] = cost[i] + Math.min(ans[i - 1], ans[i - 2]);
        }
        return Math.min(ans[cost.length - 1],ans[cost.length - 2]);
    }
}
