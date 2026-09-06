class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }
        ListNode before = null;
        ListNode l = head;
        for (int i = 1; i < left; i++) {
            before = l;
            l = l.next;
        }
        ListNode r = l;
        for (int i = left; i < right; i++) {
            r = r.next;
        }
        ListNode after = r.next;
        r.next = null;
        ListNode newHead = reverse(l);
        if (before != null) {
            before.next = newHead;
        } else {
            head = newHead;
        }
        l.next = after;
        return head;
    }
    private ListNode reverse(ListNode l) {
        ListNode pre = null;
        while (l != null) {
            ListNode l2 = l.next;
            l.next = pre;
            pre = l;
            l = l2;
        }
        return pre;
    }
}