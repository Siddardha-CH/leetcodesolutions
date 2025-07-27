# You are given an integer array nums with a length divisible by 3.

# You want to make the array empty in steps. In each step, you can select any three elements 
# from the array, compute their median, and remove the selected elements from the array.

# The median of an odd-length sequence is defined as the middle element of the sequence when it 
# is sorted in non-decreasing order.

# Return the maximum possible sum of the medians computed from the selected elements.©leetcode

______________________________________________________________________________________________________



class Solution:
    def maximumMedianSum(self, nums: List[int]) -> int:
        nums.sort()
        ans = 0
        l = 0
        r =  len(nums) - 1
        while l < r:
            r -= 1
            l += 1
            ans += nums[r]
            r -= 1
        return ans
            
        
