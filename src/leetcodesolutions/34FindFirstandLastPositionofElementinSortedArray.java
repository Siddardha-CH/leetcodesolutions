// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

----------------------------------------------------------------


  class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = ff(nums, target);
        ans[1] = fl(nums, target);
        return ans;
    }

    public int ff(int[] n, int t) {
        int l = 0;
        int r = n.length - 1;
        int ans = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (n[m] == t) {
                ans = m;
                r = m - 1;
            } else if (n[m] > t) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return ans;
    }

    public int fl(int[] n, int t) {
        int l = 0;
        int r = n.length - 1;
        int ans = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (n[m] == t) {
                ans = m;
                l = m + 1;
            } else if (n[m] > t) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return ans;
    }
}
