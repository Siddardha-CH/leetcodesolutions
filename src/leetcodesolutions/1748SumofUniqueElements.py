# You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.

# Return the sum of all the unique elements of nums.

___________________________________________________________________________________________________________________________




class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        ans = 0
        nums.sort()
        a = 0
        for i in range(1,len(nums)):
            if nums[i - 1] == nums[i]:
                a = 1
            else:
                if a == 0:
                    ans += nums[i - 1]
                a = 0
        if a == 0:
            ans += nums[-1]
        return ans
            
        
