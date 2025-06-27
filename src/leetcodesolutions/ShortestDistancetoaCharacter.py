# Given a string s and a character c that occurs in s, return an array of integers answer 
# where answer.length == s.length and answer[i] is the distance from index i to the closest occurrence of character c in s.

# The distance between two indices i and j is abs(i - j), where abs is the absolute value function.

___________________________________________________________________________________________________________________________
  ----------------------------------------------------------------------------------------------------------------------

class Solution:
    def shortestToChar(self, s: str, c: str) -> List[int]:
        l = []
        for i in s:
            if i == c:
                l.append(0)
            else:
                l.append(-1)
        a = 0
        b = 0
        c = []
        for i in l:
            if a != 0 and i != 0:
                b += 1
                c.append(b)
            elif i == 0:
                a = 1
                b = 0
                c.append(0)
            else:
                c.append(99999)
        b = 0
        a = 0
        for i in range(len(c) - 1, -1, -1):
            if c[i] == 0:
                a = 1
                b = 0
            elif c[i]!= 0 and a != 0:
                b += 1
                c[i] = min(b,c[i])
        print(l)
        print(c)
        return c

        
