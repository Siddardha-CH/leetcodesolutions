# Value of an alphanumeric string can be defined as:

# The numeric representation of the string in base 10, if it comprises of digits only.
# The length of the string, otherwise.
# Given an array strs of alphanumeric strings, return the maximum value of any string in strs.

____________________________________________________________________________________________________________________________________
------------------------------------------------------------------------------------------------------------------------------------
                                                          class Solution:
                                                            def maximumValue(self, strs: List[str]) -> int:
                                                                ans = 0
                                                                for i in strs:
                                                                    if i.isdigit():
                                                                        ans = max(ans,int(i))
                                                                    else:
                                                                        ans = max(ans, len(i))
                                                                return ans

        
