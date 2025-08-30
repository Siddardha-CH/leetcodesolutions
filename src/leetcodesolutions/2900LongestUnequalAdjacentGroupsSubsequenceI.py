# You are given a string array words and a binary array groups both of length n.

# A subsequence of words is alternating if for any two consecutive strings in the sequence, 
# their corresponding elements at the same indices in groups are different (that is, there cannot be consecutive 0 or 1).

# Your task is to select the longest alternating subsequence from words.

# Return the selected subsequence. If there are multiple answers, return any of them.

# Note: The elements in words are distinct.

--------------------------------------------------------------------------------------------



class Solution:
    def getLongestSubsequence(self, words: List[str], groups: List[int]) -> List[str]:
        if len(words) == 1:
            return words
        ans = []
        c = groups[0]
        ans.append(words[0])
        i = 1
        while i < len(groups):
            if (groups[i] != c):
                ans.append(words[i])
                c = groups[i]
            i += 1
        return ans
        
