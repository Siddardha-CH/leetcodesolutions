# Given a 0-indexed string s, permute s to get a new string t such that:

# All consonants remain in their original places. More formally, if there is an index i with 
# 0 <= i < s.length such that s[i] is a consonant, then t[i] = s[i].
# The vowels must be sorted in the nondecreasing order of their ASCII values. More formally, f
# or pairs of indices i, j with 0 <= i < j < s.length such that s[i] and s[j] are vowels, then t[i] must not have a higher ASCII value than t[j].
# Return the resulting string.

# The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in lowercase or uppercase. Consonants comprise all letters that are not vowels.



________________________________________________________________________________





class Solution:
    def sortVowels(self, s: str) -> str:
        v = []
        for x in s:
            if (x == 'a' or x == 'e' or x == 'i' or x == 'o' or x == 'u' or x == 'A' or x == 'E' or x == 'I' or x == 'O' or x == 'U'):
                v.append(x)
        a = 0
        v.sort()
        print(v)
        ans = ""
        for x in s:
            if (x == 'a' or x == 'e' or x == 'i' or x == 'o' or x == 'u' or x == 'A' or x == 'E' or x == 'I' or x == 'O' or x == 'U'):
                ans += v[a]
                a += 1
            else:
                ans += x
        return ans

        
