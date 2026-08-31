A critical point in a linked list is defined as either a local maxima or a local minima.

A node is a local maxima if the current node has a value strictly greater than the previous node and the next node.

A node is a local minima if the current node has a value strictly smaller than the previous node and the next node.

Note that a node can only be a local maxima/minima if there exists both a previous node and a next node.

Given a linked list head, return an array of length 2 containing [minDistance, maxDistance] where minDistance is the minimum distance between any two distinct critical points and maxDistance is the maximum distance between any two distinct critical points. If there are fewer than two critical points, return [-1, -1].







/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
        #  Date        : 2026-08-31                                             #
        #                                                                       #
        #########################################################################
        */
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int prev = head.val;
        ListNode t = head.next;
        int idx = 2;
        ArrayList<Integer> locals = new ArrayList<>();
        while (t.next != null) {
            if ((t.val > t.next.val && t.val > prev) || (t.val < t.next.val && t.val < prev))
                locals.add(idx);
            prev = t.val;
            idx += 1;
            t = t.next;
        }
        if (locals.size() < 2)
            return new int[] {-1, -1};
        Collections.sort(locals);
        int max = locals.get(locals.size() - 1) - locals.get(0);
        int min = max;
        for (int i = 0; i < locals.size() - 1; i++)
            min = Math.min(min, locals.get(i + 1) - locals.get(i));
        return new int[] {min, max};
    }
}
