// You are visiting a farm that has a single row of fruit trees arranged from left to right.
// The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.

// You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:

// You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount
// of fruit each basket can hold.
// Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree)
// while moving to the right. The picked fruits must fit in one of your baskets.
// Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
// Given the integer array fruits, return the maximum number of fruits you can pick.


---------------------------------------------------------------


  class Solution {
    public int totalFruit(int[] fruits) {
        int l = 0, ans = 0, c = 0;
        Map<Integer,Integer> boxes = new HashMap<>();
        for (int r = 0; r < fruits.length; r ++) {
            boxes.put(fruits[r],boxes.getOrDefault(fruits[r],0) + 1);
            while (boxes.size() > 2) {
                boxes.put(fruits[l],boxes.get(fruits[l]) - 1);
                if (boxes.get(fruits[l]) == 0) {
                    boxes.remove(fruits[l]);
                } 
                l += 1;
            }
            c = r - l + 1;
            ans = Math.max(ans,c);
        }
        return ans;
    }
}
