You are given an array of equal-length strings words. Assume that the length of each string is n.

Each string words[i] can be converted into a difference integer array difference[i] of 
length n - 1 where difference[i][j] = words[i][j+1] - words[i][j] where 0 <= j <= n - 2. 
Note that the difference between two letters is the difference between their positions in 
the alphabet i.e. the position of 'a' is 0, 'b' is 1, and 'z' is 25.
For example, for the string "acb", the difference integer array is [2 - 0, 1 - 2] = [2, -1].
All the strings in words have the same difference integer array, except one. You should find that string.

Return the string in words that has different difference integer array.


class Solution:
    def oddString(self, words: List[str]) -> str:
        m = []
        for i in range(0,len(words)):
            l=[]
            for j in range(0,len(words[i])-1):
                l.append(ord(words[i][j+1])-ord(words[i][j]))
            m.append(l)
            if len(m)>=3:
                a=m[0]
                b=m[1]
                c=m[2]
                if a==b:
                    for i in range(2,len(m)):
                        if m[i]!=a:
                            return words[i]
                else:
                    if a!=b and a!=c:
                        return words[0]
                    else:
                        return words[1]      
            
        print(m)
        return "0"

        
