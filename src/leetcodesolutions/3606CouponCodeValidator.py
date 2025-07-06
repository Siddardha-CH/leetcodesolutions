# You are given three arrays of length n that describe the properties of n coupons: 
# code, businessLine, and isActive. The ith coupon has:

# code[i]: a string representing the coupon identifier.
# businessLine[i]: a string denoting the business category of the coupon.
# isActive[i]: a boolean indicating whether the coupon is currently active.
# A coupon is considered valid if all of the following conditions hold:

# code[i] is non-empty and consists only of alphanumeric characters (a-z, A-Z, 0-9) and underscores (_).
# businessLine[i] is one of the following four categories: "electronics", "grocery", "pharmacy", "restaurant".
# isActive[i] is true.
# Return an array of the codes of all valid coupons, sorted first by their businessLine in the 
# order: "electronics", "grocery", "pharmacy", "restaurant", and then by code in lexicographical (ascending) order within each category

_____________________________________________________________________________________________________________________________________________
  ----------------------------------------------------------------------------------------------------------------------------------------


class Solution:
    def validateCoupons(self, code: List[str], businessLine: List[str], isActive: List[bool]) -> List[str]:
        e = []
        g = []
        p = []
        r = []
        s = ["electronics", "grocery", "pharmacy", "restaurant"]
        for i in range(len(code)):
            a = 0
            if len(code[i]) > 0 :
                for j in code[i]:
                    if j.isalpha() or j.isdigit() or j == "_":
                        x = 0
                    else:
                        a = -1
            if len(code[i]) < 1:
                a = 9
            if a == 0 and businessLine[i] in s:
                if isActive[i] == True :
                    if businessLine[i][0] == "e":
                        e.append(code[i])
                    elif businessLine[i][0] == "p":
                        p.append(code[i])
                    elif businessLine[i][0] == "g":
                        g.append(code[i])
                    else:
                        r.append(code[i])
        e.sort()
        g.sort()
        p.sort()
        r.sort()
        for i in g:
            e.append(i)
        for i in p:
            e.append(i)
        for i in r:
            e.append(i)
        return e
                
                
        
