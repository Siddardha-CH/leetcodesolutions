You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.




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
        #  Date        : 2026-06-13                                             #
        #                                                                       #
        #########################################################################
        */
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> k = new ArrayList<>();
        for (ListNode head : lists) {
            while (head != null) {
                k.add(head.val);
                head = head.next;
            }
        }
        Collections.sort(k);
        ListNode t = new ListNode(-10001);
        ListNode curr = t;
        for (int i : k) {
            ListNode l = new ListNode(i);
            curr.next = l;
            curr = curr.next;
        }
        return t.next;
    }
}
