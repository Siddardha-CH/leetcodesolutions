A robot on an infinite XY-plane starts at point (0, 0) facing north. The robot receives an array of integers commands, which represents a sequence of moves that it needs to execute. There are only three possible types of instructions the robot can receive:

-2: Turn left 90 degrees.
-1: Turn right 90 degrees.
1 <= k <= 9: Move forward k units, one unit at a time.
Some of the grid squares are obstacles. The ith obstacle is at grid point obstacles[i] = (xi, yi). If the robot runs into an obstacle, it will stay in its current location (on the block adjacent to the obstacle) and move onto the next command.

Return the maximum squared Euclidean distance that the robot reaches at any point in its path (i.e. if the distance is 5, return 25).

Note:

There can be an obstacle at (0, 0). If this happens, the robot will ignore the obstacle until it has moved off the origin. However, it will be unable to return to (0, 0) due to the obstacle.
North means +Y direction.
East means +X direction.
South means -Y direction.
West means -X direction.



class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
/*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-04-06                                             #
        #                                                                       #
        #########################################################################
        */
        int ans = 0;    
        Set<String> k = new HashSet<>();
        for (int[] i : obstacles)                              // TO FIND IF ANY OBSTARCLE EXISTS IN PATH IN O(1) : TC  
            k.add(i[0] + "," + i[1]);

        int[][] directions = new int[4][2];

        // FOR NORTH Y ++ (0,1)
        directions[0][0] =  0;
        directions[0][1] =  1;
        // FOR EAST X ++ (1, 0)
        directions[1][0] =  1;
        directions[1][1] =  0;
        // FOR SOUTH Y -- (0, -1)
        directions[2][0] =  0;
        directions[2][1] =  -1;
        // FOR WEST X -- (-1 ,0)
        directions[3][0] =  -1;
        directions[3][1] =  0;

        int direc = 0;   // INITIALLY FACING NORTH

        int x = 0; // COORDINATES
        int y = 0;

        for (int i : commands) 
            if (i == -1)
                direc = (direc + 1) % 4;       // MOVES RIGHT Eg: NORTH TO EAST AND SO ON
            else if (i == -2)
                direc = (direc + 3) % 4;        // MOVES 3 TIMES RIGHT TO MOVE TO LEFT Eg: North -> east -> south -> WEST   LEFT MOVE
            else {
                for (int j = 0; j < i; j++) {
                    int a = x + directions[direc][0];  
                    int b = y + directions[direc][1];

                    if (k.contains(a + "," + b))   // CHECKING FOR OBSTACLE
                        break;
                    
                    x = a;
                    y = b;

                    ans = Math.max(ans, (x * x) + (y * y));
                }
            }
        return ans;
    }
}
