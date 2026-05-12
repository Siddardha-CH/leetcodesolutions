You are given an array tasks where tasks[i] = [actuali, minimumi]:

actuali is the actual amount of energy you spend to finish the ith task.
minimumi is the minimum amount of energy you require to begin the ith task.
For example, if the task is [10, 12] and your current energy is 11, you cannot start this task. However, if your current energy is 13, you can complete this task, and your energy will be 3 after finishing it.

You can finish the tasks in any order you like.

Return the minimum initial amount of energy you will need to finish all the tasks.




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
        #  Date        : 2026-05-12                                             #
        #                                                                       #
        #########################################################################
        */
    public int minimumEffort(int[][] tasks) {
        

        // sorting based on difference in descending order to make sure we finish big tasks first

        Arrays.sort(tasks, (a,b) -> (b[1] - b[0]) - (a[1] - a[0]));

        int ans = 0;
        int e = 0;

        for (int[] i : tasks) {
            int act = i[0];
            int req = i[1];

            if (e < req) {
                int diff = req - e;
                ans += diff;
                e += diff;
            }

            e -= act;
        }
        return ans;
    }
}
