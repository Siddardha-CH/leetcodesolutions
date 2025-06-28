# You are given an integer array nums and an integer k. You want to find a 
# subsequence of nums of length k that has the largest sum.

# Return any such subsequence as an integer array of length k.

# A subsequence is an array that can be derived from another array 
# by deleting some or no elements without changing the order of the remaining elements.

____________________________________________________________________________________________
  ----------------------------------------------------------------------------------------

class Solution:
    def maxSubsequence(self, nums: List[int], k: int) -> List[int]:
        k = len(nums) - k
        while k > 0:
            mi = 999999
            k -= 1
            for i in range(len(nums)):
                mi = min(mi, nums[i])
            nums.remove(mi)
        return nums

