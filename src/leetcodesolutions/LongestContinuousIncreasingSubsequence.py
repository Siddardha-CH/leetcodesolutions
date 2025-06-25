# Given an unsorted array of integers nums, return the length of the longest continuous increasing subsequence (i.e. subarray). 
# The subsequence must be strictly increasing.

# A continuous increasing subsequence is defined by two indices l and r (l < r) such that it is
# [nums[l], nums[l + 1], ..., nums[r - 1], nums[r]] and for each l <= i < r, nums[i] < nums[i + 1].


____________________________________________________________________________________________________________________________________
------------------------------------------------------------------------------------------------------------------------------------


class Solution:
    def findLengthOfLCIS(self, nums: List[int]) -> int:
        a = 1
        b = 0
        for i in range(len(nums) - 1):
            if nums[i] < nums[i + 1]:
                a += 1
            else:
                b = max(b, a)
                a = 1
        b = max(b, a)
        return b
