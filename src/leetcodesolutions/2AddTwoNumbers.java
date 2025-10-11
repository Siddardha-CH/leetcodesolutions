// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in 
// reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

// You may assume the two numbers do not contain any leading zero, except the number 0 itself.



---------------------------------------------------


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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode();
        ListNode ans = temp;
        int total = 0;
        int c = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                total += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                total += l2.val;
                l2 = l2.next;
            }
            total += c;
            int n = total % 10;
            if (total >= 10) {
                c = 1;
            }
            else {
                c = 0;
            }
            total = 0;
            temp.next = new ListNode(n);
            temp = temp.next;
        }
        if (c == 1) {
            temp.next = new ListNode(1);
        }
        ans = ans.next;
        return ans;
    }
}
