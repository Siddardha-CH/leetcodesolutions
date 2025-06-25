# You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, 
# due to some error, one of the numbers in s got duplicated to another number in the set, which results in 
# repetition of one number and loss of another number.

# You are given an integer array nums representing the data status of this set after the error.

# Find the number that occurs twice and the number that is missing and return them in the form of an array.'


___________________________________________________________________________________________________________________________________________
--------------------------------------------------------------------------------------------------------------------------------------------


class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        nums.sort()
        a = 0
        for i in range(len(nums) - 1):
            if  nums[i] == nums[i+1]:
                a = nums[i]
                break
        l = []
        b = 0
        for i in range(1, len(nums) + 1):
            l.append(i)
        for i in l:
            if i not in  nums:
                b = i
                break
        return [a, b]
