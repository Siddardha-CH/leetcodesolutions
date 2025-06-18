# There are n employees, each with a unique id from 0 to n - 1.

# You are given a 2D integer array logs where logs[i] = [idi, leaveTimei] where:

# idi is the id of the employee that worked on the ith task, and
# leaveTimei is the time at which the employee finished the ith task. All the values leaveTimei are unique.
# Note that the ith task starts the moment right after the (i - 1)th task ends, and the 0th task starts at time 0.

# Return the id of the employee that worked the task with the longest time. If there is a tie between two or more
# employees, return the smallest id among them.


class Solution:
    def hardestWorker(self, n: int, logs: List[List[int]]) -> int:
        l = []
        l.append(logs[0][1])
        for i in range (0,len(logs)-1):
            l.append(logs[i+1][1] - logs[i][1])
        print(l)
        a = max(l)
        k=[]
        for i in range(0,len(l)):
            if a==l[i]:
                k.append(logs[i][0])
        return min(k)
        

        
