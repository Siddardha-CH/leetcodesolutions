# Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, 
# and return an array of the non-overlapping intervals that cover all the intervals in the input.

 ________________________________________________________________________________________________
   --------------------------------------------------------------------------------------------

class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        # 
        intervals.sort()
        ans = []
        a = 0
        while a < len(intervals):
            st = intervals[a][0]
            last = intervals[a][1]
            while a + 1 < len(intervals) and last >= intervals[a + 1][0]: #checking until no more greater than last if there replacing 
                last = max(last, intervals[a + 1][1])
                a += 1
            ans.append([st,last])
            a += 1
        return ans
        
