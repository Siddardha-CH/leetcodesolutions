You are given a 2D array points and a string s where, points[i] represents the coordinates of point i, and s[i] represents the tag of point i.

A valid square is a square centered at the origin (0, 0), has edges parallel to the axes, and does not contain two points with the same tag.

Return the maximum number of points contained in a valid square.

Note:

A point is considered to be inside the square if it lies on or within the square's boundaries.
The side length of the square can be zero.




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
        #  Date        : 2026-04-25                                             #
        #                                                                       #
        #########################################################################
        */
    public int maxPointsInsideSquare(int[][] points, String s) {
        // Map<Character, Integer> map = new HashMap<>();
        // int ans = 0;
        // int secmin = Integer.MAX_VALUE;

        // for (int i = 0; i < points.length; i++) {
        //     char c = s.charAt(i);
        //     int l = Math.max(Math.abs(points[i][0]), Math.abs(points[i][1]));

        //     if (map.containsKey(c)) 
        //         if (map.get(c) > l) {
        //             secmin = Math.min(map.get(c), secmin);
        //             map.put(c, l);
        //         }
        //         else
        //             secmin = Math.min(l, secmin);
        //     else
        //         map.put(c, l);
        // }
        // for (int i : map.values()) 
        //     if (secmin > i)
        //         ans += 1;

        // return ans;

        int ans = 0;
        int[] k = new int[26];
        int secmin = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++)
            k[i] = secmin;
        
        for (int i = 0; i < points.length; i++) {
            int  l = Math.max(Math.abs(points[i][0]), Math.abs(points[i][1]));
            int c = s.charAt(i) - 'a';

            if (k[c] > l) {
                secmin = Math.min(secmin, k[c]);
                k[c] = l;
            }
            else
                secmin = Math.min(secmin, l);
        }

        for (int i : k)
            if (secmin > i)
                ans += 1;

        return ans;
    }
}
