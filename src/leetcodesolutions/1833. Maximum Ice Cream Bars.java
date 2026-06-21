It is a sweltering summer day, and a boy wants to buy some ice cream bars.

At the store, there are n ice cream bars. You are given an array costs of length n, where costs[i] is the price of the ith ice cream bar in coins. The boy initially has coins coins to spend, and he wants to buy as many ice cream bars as possible. 

Note: The boy can buy the ice cream bars in any order.

Return the maximum number of ice cream bars the boy can buy with coins coins.

You must solve the problem by counting sort.






class Solution {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-06-21                                             #
        #                                                                       #
        #########################################################################
        */
    public int maxIceCream(int[] costs, int coins) {
        int[] k = new int[100000];
        for (int i : costs) 
            k[i - 1] += 1;
        int ans = 0;
        for (int i = 0; i < 100000; i++) {
            if ((i + 1) * k[i] <= coins) {
                ans += k[i];
                coins -= k[i] * (i + 1);
            }
            else {
                int j = k[i];
                while (coins >= i + 1) {
                    coins -= (i + 1);
                    j -= 1;
                    ans += 1;
                }
                break;
            }
        }
        return ans;
    }
}
