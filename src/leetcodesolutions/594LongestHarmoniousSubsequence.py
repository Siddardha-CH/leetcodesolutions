# We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.

# Given an integer array nums, return the length of its longest harmonious subsequence among all its possible subsequences.

_________________________________________________________________________________________________________________________________
 ------------------------------------------------------------------------------------------------------------------------------

class Solution:
    def findLHS(self, nums: List[int]) -> int:
        nums.sort()
        ans = 0
        a = 0
        for i in range(len(nums)):
            while nums[i] - nums[a] > 1:
                a += 1
            if nums[i] - nums[a] == 1:
                c = i - a
                ans = max(ans, c + 1)
        return ans
