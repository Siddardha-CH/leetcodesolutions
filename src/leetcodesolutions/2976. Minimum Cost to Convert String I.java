// You are given two 0-indexed strings source and target, both of length n and consisting of lowercase English letters. 
// You are also given two 0-indexed character arrays original and changed, and an integer array cost, where cost[i] represents 
// the cost of changing the character original[i] to the character changed[i].

// You start with the string source. In one operation, you can pick a character x from the string and change it to the character
// y at a cost of z if there exists any index j such that cost[j] == z, original[j] == x, and changed[j] == y.

// Return the minimum cost to convert the string source to the string target using any number of operations. If it is 
// impossible to convert source to target, return -1.

// Note that there may exist indices i, j such that original[j] == original[i] and changed[j] == changed[i].





------------------------------------------SOLUTION----------------------------------------------



class Solution {
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        long[][] dis = new long[26][26];
        long ans = 0;
        long inf = Long.MAX_VALUE / 2;
        for (int i = 0; i < 26; i++)
            for (int j = 0; j < 26; j++)
                dis[i][j] = inf;
        for (int i = 0; i < 26; i++)
            dis[i][i] = 0;
        for (int i = 0; i < original.length; i++)  
            dis[original[i] - 'a'][changed[i] - 'a'] = Math.min(dis[original[i] - 'a'][changed[i] - 'a'], cost[i]);
        for (int i = 0; i < 26; i++)
            for (int j = 0; j < 26; j++)
                if (dis[j][i] == inf)
                    continue;
                else
                    for (int k = 0; k < 26; k++)
                        if (dis[i][k] != inf)
                            dis[j][k] = Math.min(dis[j][k], dis[j][i] + dis[i][k]);
        for (int i = 0; i < target.length(); i++)
            if (target.charAt(i) == source.charAt(i))
                continue;
            else {
                long n =dis[source.charAt(i) - 'a'][target.charAt(i) - 'a'];
                if (n == inf)
                    return -1;
                ans += n;
            }
        return ans;
    }
}
