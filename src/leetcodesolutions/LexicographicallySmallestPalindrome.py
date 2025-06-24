# You are given a string s consisting of lowercase English letters, and you are allowed to perform 
# operations on it. In one operation, you can replace a character in s with another lowercase English letter.

# Your task is to make s a palindrome with the minimum number of operations possible. If there are multiple 
# palindromes that can be made using the minimum number of operations, make the lexicographically smallest one.

# A string a is lexicographically smaller than a string b (of the same length) if in the first position
# where a and b differ, string a has a letter that appears earlier in the alphabet than the corresponding letter in b.

# Return the resulting palindrome string.


__________________________________________________________________________________________________________________________________
----------------------------------------------------------------------------------------------------------------------------------



class Solution:
    def makeSmallestPalindrome(self, s: str) -> str:
        a = 0
        b = len(s) - 1
        ans1 = ""
        while a <= b:
            if ord(s[a]) < ord(s[b]):
                ans1 += s[a]
            else :
                ans1 += s[b]
            a +=1
            b -= 1
        print(ans1)
        ans2 = ans1[::-1]
        ans3 = ans1[:-1][::-1]
        print(ans2)
        print(ans3)
        if len(s) % 2 == 0:
            return ans1 + ans2
        else:
            return ans1 + ans3
            


















    
        
