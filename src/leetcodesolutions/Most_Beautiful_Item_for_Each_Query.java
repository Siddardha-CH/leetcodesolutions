//You are given a 2D integer array items where items[i] = [price, beauty] denotes the price and beauty of an item respectively.
//
//You are also given a 0-indexed integer array queries. For each queries[j], you want to determine the maximum beauty
//of an item whose price is less than or equal to queries[j]. If no such item exists, then the answer to this query is 0.
//
//Return an array answer of the same length as queries where answer[j] is the answer to the j th query.
//Constraints:
//
//1 <= items.length, queries.length <= 105
//items[i].length == 2
//1 <= price, beauty, queries[j] <= 109

package leetcodesolutions;

public class Most_Beautiful_Item_for_Each_Query {
	import java.util.Arrays;
	class Solution {
	    public int[] maximumBeauty(int[][] items, int[] queries) {
	        int r = items.length;
	        int c = 2;
	        int n = queries.length;
	        int[] answer = new int[n];
	        Arrays.sort(items, (a, b) -> Integer.compare(a[0], b[0]));
	        int ma = 0;
	        for (int i = 0; i < r; i++) {
	            ma = Math.max(ma, items[i][1]);
	            items[i][1] = ma;
	        }
	        for (int i = 0; i < n; i++) {
	            int l = 0;
	            int r1 = r - 1;
	            int a = queries[i];
	            int x = 0;
	            while (l <= r1) {
	                int m = l + (r1 - l) / 2;
	                if (a >= items[m][0]) {
	                    x = items[m][1];
	                   l = m+1;
	                } else {
	                    r1 = m-1;
	                }
	            }
	            answer[i] = x;
	        }
	        return answer;
	    }
	}

}
