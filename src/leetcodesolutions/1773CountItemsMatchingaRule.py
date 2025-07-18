# You are given an array items, where each items[i] = [typei, colori, namei] 
# describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

# The ith item is said to match the rule if one of the following is true:

# ruleKey == "type" and ruleValue == typei.
# ruleKey == "color" and ruleValue == colori.
# ruleKey == "name" and ruleValue == namei.
# Return the number of items that match the given rule.

__________________________________________________________________________________________________________________________________


class Solution:
    def countMatches(self, items: List[List[str]], ruleKey: str, ruleValue: str) -> int:
        ans = 0
        for i in items:
            if ruleKey == "type" and ruleValue == i[0]:
                ans += 1
            elif ruleKey == "color" and ruleValue == i[1]:
                ans += 1
            elif ruleKey == "name" and ruleValue == i[2]:
                ans += 1
        return ans
        
