# Given an integer array nums, return the number of subarrays of length 3 such 
# that the sum of the first and third numbers equals exactly half of the second number.


  class Solution:
    def countSubarrays(self, nums: List[int]) -> int:
        a=0
        for i in range(len(nums)-2):
            if(nums[i+1]==(nums[i]+nums[i+2])*2):
                a+=1
        return a
        exactly half of the second number.

 

