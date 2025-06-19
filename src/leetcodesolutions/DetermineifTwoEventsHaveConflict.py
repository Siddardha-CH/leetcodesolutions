You are given two arrays of strings that represent two inclusive events that happened on the same day, event1 and event2, where:

event1 = [startTime1, endTime1] and
event2 = [startTime2, endTime2].
Event times are valid 24 hours format in the form of HH:MM.

A conflict happens when two events have some non-empty intersection (i.e., some moment is common to both events).

Return true if there is a conflict between two events. Otherwise, return false.


class Solution:
    def haveConflict(self, event1: List[str], event2: List[str]) -> bool:
        s1 = event1[1]
        s2 = event2[0]
        s3 = event1[0]
        s4 = event2[1]
        a1 = int(s1[0])*1000 + int(s1[1])*100 + int(s1[3])*10 + int(s1[4])
        a2 = int(s2[0])*1000 + int(s2[1])*100 + int(s2[3])*10 + int(s2[4])
        a3 = int(s3[0])*1000 + int(s3[1])*100 + int(s3[3])*10 + int(s3[4])
        a4 = int(s4[0])*1000 + int(s4[1])*100 + int(s4[3])*10 + int(s4[4])
        for i in range(a3,a1+1):
            if i == a2 or i == a4:
                return True
        for i in range(a2,a4+1):
            if i == a1 or i == a3:
                return True
        return False
        
