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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) {
            return head;
        }
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        int group = size / k;
        ListNode d = new ListNode(0);
        d.next = head;
        ListNode prevGroup = d;
        ListNode a = head;
        for (int c = 0; c < group; c++) {
            ListNode b = a;
            for (int i = 0; i < k - 1; i++) {
                b = b.next;
            }
            ListNode nextGroup = b.next;
            ListNode newHead = swap(a, nextGroup);
            prevGroup.next = newHead;
            a.next = nextGroup;
            prevGroup = a;
            a = nextGroup;
        }
        return d.next;
    }
    public ListNode swap(ListNode a, ListNode nextGroup) {
        ListNode pre = null;
        ListNode cur = a;
        while (cur != nextGroup) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}