# A self-dividing number is a number that is divisible by every digit it contains.

# For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
# A self-dividing number is not allowed to contain the digit zero.

# Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right] (both inclusive).

____________________________________________________________________________________________________________________________________
------------------------------------------------------------------------------------------------------------------------------------



class Solution:
    def selfDividingNumbers(self, left: int, right: int) -> List[int]:
        l = []
        while left <= right:
            
            s = str(left)
            if "0" not in s:
                b = 0
                for i in s:
                    if left % int(i) != 0:
                        b = -1
                if b != -1:
                    l.append(left)
            left += 1
        return l
