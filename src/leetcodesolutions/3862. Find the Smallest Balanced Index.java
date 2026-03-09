You are given an integer array nums.

An index i is balanced if the sum of elements strictly to the left of i equals the product of elements strictly to the right of i.

If there are no elements to the left, the sum is considered as 0. Similarly, if there are no elements to the right, the product is considered as 1.

Return an integer denoting the smallest balanced index. If no balanced index exists, return -1.



----------------------------------------SOLUTION----------------------------------------





class Solution {
    public int smallestBalancedIndex(int[] nums) {
        long k = 1;
        long s = 0;
        for (int i : nums)
            s += i;
        for (int i = nums.length - 1; i >= 0; i--) {
            s -= nums[i];
            if (s == k)
                return i;
            if (s < k)
                break;
            k *= nums[i];
        }
        return -1;
    }
}
