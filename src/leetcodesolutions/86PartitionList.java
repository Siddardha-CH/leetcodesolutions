// Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

// You should preserve the original relative order of the nodes in each of the two partitions.



------------------------------------------------------------------------------------



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
    public ListNode partition(ListNode head, int x) {
        ListNode d1 = new ListNode(0);
        ListNode d2 = new ListNode(0);
        ListNode l1 = d1;
        ListNode l2 = d2;
        ListNode t = head;
        while (t != null) {
            if (t.val < x) {
                l1.next = t;
                l1 = t;
            }
            else {
                l2.next = t;
                l2 = t;
            }
            t = t.next;
        }
        l2.next = null;
        l1.next = d2.next;
        d2.next =  null;
        head = d1.next;
        d1.next = null;
        return head;
    }
}
