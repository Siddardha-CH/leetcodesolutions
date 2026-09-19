You are given a circle represented as (radius, xCenter, yCenter) and an axis-aligned rectangle represented as (x1, y1, x2, y2), where (x1, y1) are the coordinates of the bottom-left corner, and (x2, y2) are the coordinates of the top-right corner of the rectangle.

Return true if the circle and rectangle are overlapped otherwise return false. In other words, check if there is any point (xi, yi) that belongs to the circle and the rectangle at the same time.







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
        #  Date        : 2026-19-08                                             #
        #                                                                       #
        #########################################################################
        */
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int xi, yi; // here we are finding the clostest point to the cneter

        if (x1 > xCenter)
            xi = x1;
        else if (xCenter > x2)
            xi = x2;
        else
            xi = xCenter;
        //---------
        if (y1 > yCenter)
            yi = y1;
        else if (yCenter > y2)
            yi = y2;
        else
            yi = yCenter;

        // calc dis tot neartest point xi, yi

        double dis = Math.sqrt((xCenter - xi) * (xCenter - xi) + (yCenter - yi) * (yCenter - yi));

        if (dis > (double)radius)
            return false;
        return true;
    }
}
