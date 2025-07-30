# // You are given a 0-indexed string blocks of length n, where blocks[i] is either 'W' or 'B', 
# //   representing the color of the ith block. The characters 'W' and 'B' denote the colors white and black, respectively.

# // You are also given an integer k, which is the desired number of consecutive black blocks.

# // In one operation, you can recolor a white block such that it becomes a black block.

# // Return the minimum number of operations needed such that there is at least one occurrence of k consecutive black blocks.

______________________________________________________________________________________________________________________________



  class Solution:
    def minimumRecolors(self, blocks: str, k: int) -> int:
        w = 0
        a = 0
        for i in range(k):
            if blocks[i] == 'W':
                w += 1
        if  k == len(blocks):
            return w
        ans = w
        b = k - 1
        while b < len(blocks) - 1:
            if blocks[a] == 'W':
                w -= 1
            a += 1
            b += 1
            if blocks[b] == 'W':
                w += 1
            ans = min(ans,w)      
        return ans
    


            
        
