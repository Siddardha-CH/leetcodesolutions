// You are given an integer array nums of length n, and an integer array queries of length m.

// Return an array answer of length m where answer[i] is the maximum size of a subsequence that you 
//   can take from nums such that the sum of its elements is less than or equal to queries[i].

// A subsequence is an array that can be derived from another array by deleting some or no elements 
//   without changing the order of the remaining elements.

class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] ans = new int[queries.length];
        for (int i = 0;i < queries.length; i++) {
            int t = 0;
            int c = 0;
            for (int j = 0; j < nums.length; j++) {
                if ( t + nums[j] > queries[i]) {
                    break;
                }
                else {
                    t+=nums[j];
                    c = j+1;
                }
            }
            ans[i] = c;
        }
        return ans;
    }
}

 
