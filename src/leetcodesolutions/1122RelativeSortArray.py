# Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.

# Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements 
# that do not appear in arr2 should be placed at the end of arr1 in ascending order.

___________________________________________________________________________________


class Solution:
    def relativeSortArray(self, arr1: List[int], arr2: List[int]) -> List[int]:
        ans = []
        i = 0
        while i < len(arr2):
            if arr2[i] in arr1:
                ans.append(arr2[i])
                arr1.remove(arr2[i])
            else:
                i += 1
        arr1.sort()
        ans += arr1
        return ans
        
