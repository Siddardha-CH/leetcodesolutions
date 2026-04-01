There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.

For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
Return true if you can finish all courses. Otherwise, return false.




class Solution {
    public boolean canFinish(int numCourses, int[][] pre) {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-04-01                                             #
        #                                                                       #
        #########################################################################
        */
        List<List<Integer>> k = new ArrayList<>();
        int[] sub = new int[numCourses];

        for (int i = 0; i < sub.length; i++)
            k.add(new ArrayList<>());

        for (int[] i : pre)
            k.get(i[1]).add(i[0]);
        
        for (int i = 0; i < sub.length; i++) {
            if (sub[i] == 0 && val(k, sub, i))
                return false; 
        }
        return true;
    }

    public boolean val(List<List<Integer>> k , int[] sub, int i) {
        if (sub[i] == 1)
            return true;
        if (sub[i] == 2)
            return false;
        
        sub[i] = 1;

        for (int j : k.get(i))
            if (val(k, sub, j))
                return true;

        sub[i] = 2;

        return false;
    }
}
