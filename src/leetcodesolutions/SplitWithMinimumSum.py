# Given a positive integer num, split it into two non-negative integers num1 and num2 such that:

# The concatenation of num1 and num2 is a permutation of num.
# In other words, the sum of the number of occurrences of each digit in num1 and num2 is equal to
# the number of occurrences of that digit in num.
# num1 and num2 can contain leading zeros.
# Return the minimum possible sum of num1 and num2.

# Notes:

# It is guaranteed that num does not contain any leading zeros.
# The order of occurrence of the digits in num1 and num2 may differ from the order of occurrence of num.

__________________________________________________________________________________________________________________________________
-----------------------------------------------------------------------------------------------------------------------------------
class Solution:
    def splitNum(self, num: int) -> int:
        s = str(num)
        l = []
        for i in s:
            l.append(i)
        l.sort()
        print(l)
        a1 = ""
        a2 = ""
        for i in range(len(l)):
            if i % 2 == 0:
                a1 += l[i]
            else:
                a2 += l[i]
        a1 = int(a1)
        a2 = int (a2)
        return a1 + a2

        
