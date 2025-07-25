# You are given a 0-indexed string array words.

# Two strings are similar if they consist of the same characters.

# For example, "abca" and "cba" are similar since both consist of characters 'a', 'b', and 'c'.
# However, "abacba" and "bcfd" are not similar since they do not consist of the same characters.
# Return the number of pairs (i, j) such that 0 <= i < j <= word.length - 1 and the two strings words[i] and words[j] are similar.

_________________________________________________________________________________________________________________________________________
-----------------------------------------------------------------------------------------------------------------------------------------



class Solution:
    def similarPairs(self, words: List[str]) -> int:
        s = []
        for i in range(len(words)):
            l = []
            for j in words[i]:
                if j not in l:
                    l.append(j)
            s.append(l)
        for i in s:
            i.sort()
        s.sort()
        ans = 0
        c = 1
        print(s)
        for i in range(len(s)-1):
            if s[i] == s[i + 1]:
                c += 1
            else:
                ans += (c * (c - 1)) // 2
                c = 1
        ans += (c * (c - 1)) // 2
        return ans

