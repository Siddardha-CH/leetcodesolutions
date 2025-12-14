// Given the head of a linked list, rotate the list to the right by k places.


___________________________________SOLUTION___________________________________





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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode dummy = head;
        int m = 1;
        if (head == null)
            return head;
        while (dummy.next != null) {
            dummy = dummy.next;
            m += 1;
        }
        if (m == 1)
            return head;
        k %= m;
        if (k == 0)
            return head;
        ListNode helper = head;
        for (int  i = 0; i < m - k -1; i++)
            helper = helper.next;
        ListNode temp = helper.next;
        helper.next = null;
        dummy.next = head;
        head = temp;
        return head;
    }
}
