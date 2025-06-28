# Given an integer array sorted in non-decreasing order, there is exactly one integer 
# in the array that occurs more than 25% of the time, return that integer.

_________________________________________________________________________________________
 --------------------------------------------------------------------------------------


class Solution:
    def findSpecialInteger(self, arr: List[int]) -> int:
        a = 1
        for i in range(len(arr) - 1):
            if arr[i] == arr[i + 1]:
                a += 1
                if a > 0.25 * len(arr):
                    return arr[i]
            else:
                
                a = 1
        return arr[0]   

        
