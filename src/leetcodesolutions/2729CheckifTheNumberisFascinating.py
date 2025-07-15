# You are given an integer n that consists of exactly 3 digits.

# We call the number n fascinating if, after the following modification, 
# the resulting number contains all the digits from 1 to 9 exactly once and does not contain any 0's:

# Concatenate n with the numbers 2 * n and 3 * n.
# Return true if n is fascinating, or false otherwise.

# Concatenating two numbers means joining them together. For example, the concatenation of 121 and 371 is 121371.

 _________________________________________________________________________________________________________________




class Solution:
    def isFascinating(self, n: int) -> bool:
        a = 2 * n
        b = 3 * n
        ans = str(n) + str(a) + str(b)
        ans = sorted(ans)
        a = 1
        print(ans)
        if ans[0] != '0':
            for i in range(len(ans) - 1):
                if int(ans[i]) + 1 == int(ans[i + 1]):
                    a += 1
                else:
                    return False
        if a == 9:
            return True
        return False


        
