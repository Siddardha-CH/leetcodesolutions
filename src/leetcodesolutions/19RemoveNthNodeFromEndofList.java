// Given the head of a linked list, remove the nth node from the end of the list and return its head.


 --------------------------------------------------------------------------


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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0 ; i<n ;i ++) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        fast = head;
        if (fast == slow ){
            head = head.next;
            return head;
        }
        while (fast != null) {
            if (fast.next == slow) {
                fast.next = slow.next;
                return head;
            }
            fast = fast.next;
        }
        return head;
    }
}
