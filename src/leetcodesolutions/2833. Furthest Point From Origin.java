You are given a string moves of length n consisting only of characters 'L', 'R', and '_'. The string represents your movement on a number line starting from the origin 0.

In the ith move, you can choose one of the following directions:

move to the left if moves[i] = 'L' or moves[i] = '_'
move to the right if moves[i] = 'R' or moves[i] = '_'
Return the distance from the origin of the furthest point you can get to after n moves.




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
        #  Date        : 2026-04-24                                             #
        #                                                                       #
        #########################################################################
        */
    public int furthestDistanceFromOrigin(String moves) {
        int l = 0;
        int ans = 0;
        for (char c : moves.toCharArray())
            if (c == 'L' || c == '_')
                l += 1;
            else
                l -= 1;

        ans = Math.abs(l);
         
        l = 0;

        for (char c : moves.toCharArray())
            if (c == 'R' || c == '_')
                l += 1;
            else
                l -= 1;
        
        ans = Math.max(ans, Math.abs(l));

        return ans;
    }
}
