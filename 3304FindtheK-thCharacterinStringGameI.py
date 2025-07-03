# Alice and Bob are playing a game. Initially, Alice has a string word = "a".

# You are given a positive integer k.

# Now Bob will ask Alice to perform the following operation forever:

# Generate a new string by changing each character in word to its next character in the English alphabet, and append it to the original word.
# For example, performing the operation on "c" generates "cd" and performing the operation on "zb" generates "zbac".

# Return the value of the kth character in word, after enough operations have been done for word to have at least k characters.

# Note that the character 'z' can be changed to 'a' in the operation.

_______________________________________________________________________________________________________________________________________________
  ------------------------------------------------------------------------------------------------------------------------------------------


class Solution:
    def kthCharacter(self, k: int) -> str:
        s = ["a"]
        while len(s) < k:
            n = len(s)
            for i in range(n):
                c = chr(97 + ((ord(s[i]) - 96)))
                s.append(c)
        return s[k - 1]
        
