# Alice is attempting to type a specific string on her computer. However, she tends to be clumsy 
# and may press a key for too long, resulting in a character being typed multiple times.

# Although Alice tried to focus on her typing, she is aware that she may still have done this at most once.

# You are given a string word, which represents the final output displayed on Alice's screen.

# Return the total number of possible original strings that Alice might have intended to type.


_____________________________________________________________________________________________________________
   ------------------------------------------------------------------------------------------------------


class Solution:
    def possibleStringCount(self, word: str) -> int:
        ans = 0
        # p = 0
        # for i  in range(len(word) - 1):
        #     if word[i] == word[i + 1]:
        #         p += 1
        #         print(p)
        #         print("p")
        #     else:
        #         ans += p
        #         print(ans)
        #         print("ans")
        #         p = 0
        # ans += p
        # return ans + 1
        for i in range(len(word) - 1):
            if word[i] == word[i + 1]:
                ans += 1
        return ans  + 1

        
 
