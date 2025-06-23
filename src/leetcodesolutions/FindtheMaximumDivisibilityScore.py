# You are given two integer arrays nums and divisors.

# The divisibility score of divisors[i] is the number of indices j such that nums[j] is divisible by divisors[i].

# Return the integer divisors[i] with the maximum divisibility score. If multiple integers have the maximum score, 
#   return the smallest one.



_________________________________________________________________________________________________________________________________
----------------------------------------------------------------------------------------------------------------------------------


class Solution:
    def maxDivScore(self, nums: List[int], divisors: List[int]) -> int:
        l = []
        for i in divisors:
            a = 0
            for j in nums:
                if j % i == 0:
                    a += 1
            l.append(a)
        ans = 0
        p = 0
        for i in range(len(l)):
            if l[i] == p:
                if divisors[i] > divisors[ans]:
                    ans =  ans
                else:
                    ans = i
            if l[i] > p:
                p = l[i]
                ans = i
            
        return divisors[ans]
        

