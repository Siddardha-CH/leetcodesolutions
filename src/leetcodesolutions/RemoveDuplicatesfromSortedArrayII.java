// Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.

// Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

// Return k after placing the final result in the first k slots of nums.

// Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

  
//   Constraints:
// 1 <= nums.length <= 3 * 104
// -104 <= nums[i] <= 104
// nums is sorted in non-decreasing order.

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        a=1
        i=0
        while i<len(nums)-1:
            print(i)
            
            if nums[i]==nums[i+1]:

                if a<2:
                    a+=1
                    i+=1
                else:
                    nums.pop(i)
            else:
                a=1
                i+=1
        return len(nums)



        
