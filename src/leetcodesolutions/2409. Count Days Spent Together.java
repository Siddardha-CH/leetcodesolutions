Alice and Bob are traveling to Rome for separate business meetings.

You are given 4 strings arriveAlice, leaveAlice, arriveBob, and leaveBob. Alice will be in the city from the dates arriveAlice to leaveAlice (inclusive), while Bob will be in the city from the dates arriveBob to leaveBob (inclusive). Each will be a 5-character string in the format "MM-DD", corresponding to the month and day of the date.

Return the total number of days that Alice and Bob are in Rome together.

You can assume that all dates occur in the same calendar year, which is not a leap year. Note that the number of days per month can be represented as: [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31].







class Solution {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                      #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                      #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                     #
        #  Description : Solution / Code / Project                                #
        #  Date        : 2026-24-10                                               #
        #                                                                       #
        #########################################################################
        */
    int[] months = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int aa = 0, la = 0, ab = 0, lb = 0;
        aa = func(arriveAlice);
        la = func(leaveAlice);
        ab = func(arriveBob);
        lb = func(leaveBob);
        int ans = Math.min(la, lb) - Math.max(aa, ab);
        if (ans < 0)
            return 0;
        return ans + 1;
    }
    int func(String s) {
        int k = 0;
        int m = Integer.parseInt(s.charAt(0) + "" + s.charAt(1));
        int d = Integer.parseInt(s.charAt(3) + "" + s.charAt(4));
        for (int i = 0; i < m - 1; i++)
            k += months[i];
        k += d;
        System.out.println(k);
        return k;
    }
}
