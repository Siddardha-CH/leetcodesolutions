// We are given a list nums of integers representing a list compressed with run-length encoding.

// Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0). 
//   For each such pair, there are freq elements with value val concatenated in a sublist. Concatenate 
//   all the sublists from left to right to generate the decompressed list.

// Return the decompressed list.


class Solution:
    def decompressRLElist(self, nums: List[int]) -> List[int]:
        l = []
        for i in range(0,len(nums)-1):
            if i % 2 == 0:
                temp = nums[i]
                while (temp != 0):
                    l.append(nums[i+1])
                    temp-=1
        return l


        
 
