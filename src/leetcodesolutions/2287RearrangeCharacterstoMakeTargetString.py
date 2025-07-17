# You are given two 0-indexed strings s and target. You can take some letters from s and rearrange them to form new strings.

# Return the maximum number of copies of target that can be formed by taking letters from s and rearranging them.

____________________________________________________________________________________________________________________

class Solution:
    def rearrangeCharacters(self, s: str, target: str) -> int:
        ans  = 0
        b = len(target)
        while b == len(target):
            b = 0
            for i in target:
                if i in s:
                    b += 1
                    s = s.replace(i,"",1)
            if b == len(target):
                ans += 1
            print(s)
        return ans

        
        
