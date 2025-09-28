// Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

----------------------------------------------------------------------


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
    public boolean isPalindrome(ListNode head) {
        if (head.next == null) {
            return true;
        }
        ArrayList<Integer> k = new ArrayList<>();
        ListNode p = head;
        while (p != null) {
            k.add(p.val);
            p = p.next;
        }
        int st = 0;
         int end = k.size() - 1;
         while (end > st) {
            if (k.get(st) != k.get(end)) {
                return false;
            }
            st += 1;
            end -= 1;
         }
         return true;
    }
}
