# You are given a string text of words that are placed among some number of spaces. 
# Each word consists of one or more lowercase English letters and are separated by at
# least one space. It's guaranteed that text contains at least one word.

# Rearrange the spaces so that there is an equal number of spaces between every pair of
# adjacent words and that number is maximized. If you cannot redistribute all the space
# s equally, place the extra spaces at the end, meaning the returned string should be the same length as text.

# Return the string after rearranging the spaces.


____________________________________________________________________________________________________________


class Solution:
    def reorderSpaces(self, text: str) -> str:
        s = 0
        for i in text:
            if i == " ":
                s += 1
        l = text.split()
        if len(l) == 1:
            k = ""
            k += l[0]
            for i in range(len(text)- len(l[0])):
                k += " "
            return k
        p = len(l) - 1
        a = s // p
        print(l)
        print(a)
        b = s % p
        ans = ""
        for i in range(len(l)):
            ans += l[i]
            c = a
            if i != len(l) - 1:
                while c > 0:
                    ans += " "
                    c -= 1
        for i in range(b):
            ans += " "
        return ans
        
 
