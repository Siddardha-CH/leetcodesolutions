# You are given an integer n.

# Return the concatenation of the hexadecimal representation of n2 and the hexatrigesimal 
# representation of n3.

# A hexadecimal number is defined as a base-16 numeral system that uses the digits 0 – 9 and 
# the uppercase letters A - F to represent values from 0 to 15.

# A hexatrigesimal number is defined as a base-36 numeral system that uses the digits 0 – 9 and 
# the uppercase letters A - Z to represent values from 0 to 35.

# Note: Please do not copy the description during the contest to maintain the integrity of your submissions.

___________________________________________________________________________________________________________________
 -----------------------------------------------------------------------------------------------------------------



class Solution:
    def concatHex36(self, n: int) -> str:
        p = n * n
        l = []
        s = n * n * n
        while s > 0:
            a = s % 36
            l.append(a)
            s //= 36
        while p > 0:
            a = p % 16
            l.append(a)
            p = p // 16       
        for i in range (len(l)):
            if l[i] > 9:
                l[i] = chr(l[i] + 55)
            else:
                l[i] = str(l[i])
        ans = ""
        for i in range(len(l) - 1, -1, -1):
            ans += l[i]
        print(ans)
        return ans
            
        
