# You are given a string title consisting of one or more words separated by a single space,
# where each word consists of English letters. Capitalize the string by changing the capitalization of each word such that:

# If the length of the word is 1 or 2 letters, change all letters to lowercase.
# Otherwise, change the first letter to uppercase and the remaining letters to lowercase.
# Return the capitalized title.

________________________________________________________________________________________________________________________
 ----------------------------------------------------------------------------------------------------------------------

class Solution:
    def capitalizeTitle(self, title: str) -> str:
         l = title.split()
         print(l)
         s = ""
         for i in l:
            if len(i) > 2:
                s += i.capitalize()
            else:
                s += i.lower()
            s += " "
         return s[:-1]
        
