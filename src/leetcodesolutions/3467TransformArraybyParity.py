# You are given an integer array nums. Transform nums by performing the following operations in the exact order specified:

# Replace each even number with 0.
# Replace each odd numbers with 1.
# Sort the modified array in non-decreasing order.
# Return the resulting array after performing these operations.

_______________________________________________________________________


class Solution:
    def transformArray(self, nums: List[int]) -> List[int]:
        a = 0
        b = 0
        for i in nums:
            if i % 2 ==0 :
                a += 1
            else:
                b += 1
        l = []
        for i in range(a):
            l.append(0)
        for i in range(b):
            l.append(1)
        return l
        
