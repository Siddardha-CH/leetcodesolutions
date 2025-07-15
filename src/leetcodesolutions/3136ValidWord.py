# A word is considered valid if:

# It contains a minimum of 3 characters.
# It contains only digits (0-9), and English letters (uppercase and lowercase).
# It includes at least one vowel.
# It includes at least one consonant.
# You are given a string word.

# Return true if word is valid, otherwise, return false.

# Notes:

# 'a', 'e', 'i', 'o', 'u', and their uppercases are vowels.
# A consonant is an English letter that is not a vowel.

____________________________________________________________________________________________


class Solution:
    def isValid(self, word: str) -> bool:
        vowels = ["a", "e", "i", "o", "u", "A", "E", "I", "O", "U"]
        nums = ["1", "2" , "3", "4", "5", "6", "7", "8", "0", "9"]
        if len(word) > 2:
            a = 0
            b = 0
            for i in word:
                if i.isalnum():
                    if i in vowels:
                        a += 1
                    elif i in nums:
                        p = 2
                    else:
                        b += 1
                else:
                    return False
            if a > 0 and b > 0:
                return True
        return False
        
