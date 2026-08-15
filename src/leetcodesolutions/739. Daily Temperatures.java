Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of
days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.





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
        #  Date        : 2026-08-15                                             #
        #                                                                       #
        #########################################################################
        */
    public int[] dailyTemperatures(int[] arr) {
        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) // undestand once
                ans[stack.peek()] = i - stack.pop();
            stack.push(i);
        }
        return ans;
    }
}
