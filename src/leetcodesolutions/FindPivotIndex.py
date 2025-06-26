# Given an array of integers nums, calculate the pivot index of this array.

# The pivot index is the index where the sum of all the numbers strictly to the 
# left of the index is equal to the sum of all the numbers strictly to the index's right.

# If the index is on the left edge of the array, then the left sum is 0 because 
# there are no elements to the left. This also applies to the right edge of the array.

# Return the leftmost pivot index. If no such index exists, return -1.

___________________________________________________________________________________________________________________________________________
-------------------------------------------------------------------------------------------------------------------------------------------


class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        a = sum(nums)
        p   = 0
        i = 0
        while i < len(nums):
            r = a - p - nums[i]
            if p == r:
                return i
            p += nums[i]
            i += 1
        return -1
