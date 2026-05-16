Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.







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
        #  Date        : 2026-05-16                                             #
        #                                                                       #
        #########################################################################
        */
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        int l = 0;
        while (temp != null) {
            l += 1;
            temp = temp.next;
        }
        if (k > l)
            return head;
        
        int p = l / k;
        ListNode curr = head;
        ListNode prevt = null;
        ListNode newh = null;
        while (p > 0) {
            int c = k;
            ListNode prev = null;
            ListNode first = curr;
            while (c > 0) {
                c -= 1;
                temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }
            if (newh == null) // using for new head
                newh = prev;
            if (prevt != null) // using to link old group tail to new group head(that is last elemnet before reverse)
                prevt.next = prev;
            first.next = curr;  // using to link last elemnt of reversed group to new un reversed elements
            prevt = first; // placing previoustail to new groups last element
            p -= 1;
        }
        return newh;
    }
}
