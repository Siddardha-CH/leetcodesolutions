# You are given an integer array nums of size n where n is a multiple of 3 and a positive integer k.

# Divide the array nums into n / 3 arrays of size 3 satisfying the following condition:

# The difference between any two elements in one array is less than or equal to k.
# Return a 2D array containing the arrays. If it is impossible to satisfy the conditions, return an empty array. And if there are multiple answers, return any of them.

_____________________________________________________________________________________________



class Solution:
    def divideArray(self, nums: List[int], k: int) -> List[List[int]]:
        nums.sort()
        c = 0
        ans = []
        i = 0
        while i < len(nums) - 2:
            l = []
            if nums[i + 2] - nums[i] <= k:
                l.append(nums[i])
                l.append(nums[i + 1])
                l.append(nums[i + 2])
                i += 3
                ans.append(l)
            else:
                return []
        return ans

        
