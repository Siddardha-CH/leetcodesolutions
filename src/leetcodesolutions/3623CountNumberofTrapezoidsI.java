// You are given a 2D integer array points, where points[i] = [xi, yi] represents the coordinates of the ith point on the Cartesian plane.

// A horizontal trapezoid is a convex quadrilateral with at least one pair of horizontal sides (i.e. parallel to the x-axis). Two lines are parallel if and only if they have the same slope.

// Return the number of unique horizontal trapezoids that can be formed by choosing any four distinct points from points.

// Since the answer may be very large, return it modulo 109 + 7.


-----------------------------------SOLUTION-------------------------------------------


  class Solution {
    public int countTrapezoids(int[][] points) {
        int ans = 0;
        int a = 0;
        int mod = 1000000007;
        Map<Integer,Integer> map = new HashMap<>();
        for (int[] i : points) 
            map.put(i[1],map.getOrDefault(i[1],0) + 1);
        for (Map.Entry<Integer,Integer> e : map.entrySet()) {
            int k = e.getValue();
            long s = (long) k * (k - 1) / 2;
            s %= mod;
            ans = (int)((ans + a * s) % mod);
            a += s;
        }
        return ans;
    }
}
