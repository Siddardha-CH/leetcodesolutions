# Given a string s, reverse only all the vowels in the string and return it.

# The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

______________________________________________________________________________________________________________



class Solution:
    def reverseVowels(self, s: str) -> str:
        l = []
        v = ["a","e","i","o","u","A","E","I","O","U"]
        for i in s:
            if i in v:
                l.append(i)
        l = l[::-1]
        a = 0
        ans = ""
        for i in s:
            if i in v:
                ans += l[a]
                a += 1
            else:
                ans += i
        return ans
        
