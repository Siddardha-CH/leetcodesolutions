# You are given a 0-indexed string word, consisting of lowercase English letters. You need to select one index and 
# remove the letter at that index from word so that the frequency of every letter present in word is equal.

# Return true if it is possible to remove one letter so that the frequency of all letters in word are equal, and false otherwise.

# Note:

# The frequency of a letter x is the number of times it occurs in the string.
# You must remove exactly one letter and cannot choose to do nothing.

________________________________________________________________________________________________________________________________
  ----------------------------------------------------------------------------------------------------------------------------


class Solution:
    def equalFrequency(self, word: str) -> bool:
        l = []
        for i in word:
            l.append(i)
        l.sort()
        a = 1
        c = []
        for i in range(len(l) - 1):
            if l[i] == l[i + 1]:
                a += 1
            else:
                c.append(a)
                a = 1
        c.append(a)
        print(c)
        c.sort()
        if len(c) >= 2 and c[0] == c[-2] and c[-1] == c[0] + 1:
            return True
        if len(c) >= 2 and c[0] == 1 and c[1] == c[-1]:
            return True
        if len(c) == 1:
            return True
        return False
    
        
