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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        ListNode rh = null;
        while (head2 != null) {
            ListNode t = head2;
            head2 = head2.next;
            t.next=rh;
            rh=t;
        }
        head2 = rh;
        while (head2 != null) {
            ListNode next1 = head.next;
            ListNode next2 = head2.next;

            head.next = head2;
            head2.next = next1;

            head = next1;
            head2 = next2;
        }
    }
}