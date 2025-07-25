# You are given a string s of lowercase English letters and an array widths denoting 
# how many pixels wide each lowercase English letter is. Specifically, widths[0] is the 
# width of 'a', widths[1] is the width of 'b', and so on.

# You are trying to write s across several lines, where each line is no longer than 
# 100 pixels. Starting at the beginning of s, write as many letters on the first line 
# such that the total width does not exceed 100 pixels. Then, from where you stopped 
# in s, continue writing as many letters as you can on the second line. Continue this process until you have written all of s.

# Return an array result of length 2 where:

# result[0] is the total number of lines.
# result[1] is the width of the last line in pixels.

___________________________________________________________________________________________________________________________________
---------------------------------------------------------------------------------------------------------------------------------

class Solution:
    def numberOfLines(self, widths: List[int], s: str) -> List[int]:
        a = 1
        c = 0
        for i in s:
            p = widths[ord(i) - 97]
            if p + c > 100:
                a += 1
                c = p
            else:
                c += p
        return [a, c]

        
