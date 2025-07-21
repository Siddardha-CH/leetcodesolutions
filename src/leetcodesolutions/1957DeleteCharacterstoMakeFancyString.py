# A fancy string is a string where no three consecutive characters are equal.

# Given a string s, delete the minimum possible number of characters from s to make it fancy.

# Return the final string after the deletion. It can be shown that the answer will always be unique.

______________________________________________________________________________________________________


class Solution:
    def makeFancyString(self, s: str) -> str:
        if len(s) < 3:
            return s
        l = []
        l.append(s[0])
        l.append(s[1])
        for i in range(2,len(s)):
            if s[i] == l[-1] and s[i] == l[-2]:
                continue
            l.append(s[i])           
        return "".join(l)
        
