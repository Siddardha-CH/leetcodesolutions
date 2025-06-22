You are given an integer money denoting the amount of money (in dollars) 
that you have and another integer children denoting the number of children 
that you must distribute the money to.

You have to distribute the money according to the following rules:

All money must be distributed.
Everyone must receive at least 1 dollar.
Nobody receives 4 dollars.
Return the maximum number of children who may receive exactly 8 dollars if 
you distribute the money according to the aforementioned rules. If there is 
no way to distribute the money, return -1.

_____________________________________________________________________________________________________________________________________
--------------------------------------------------------------------------------------------------------------------------------------

class Solution:
    def distMoney(self, money: int, children: int) -> int:
        if children > money:
            return -1
        if children * 8 == money :
            return children
        if children * 8 < money :
            return children - 1
        l = []
        for i in range(children):
            l.append(1)
        money = money - children
        ans = 0
        index = 0
        while (money != 0):
            if money < 7:
                l[index] = l[index] + money
                money = 0
            else:
                l[index] = l[index] + 7
                money -= 7
            index += 1
        for i in l:
            if i == 8:
                ans += 1
        for i in range(len(l)):
            if l[i] == 4 and i == len(l) - 1:
                return ans - 1
        return ans
