class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode root = new ListNode(0, head);
        ListNode prev = head;
        ListNode cur = head.next;
        ListNode forw = cur.next;

        while (forw != null) {
            cur.next = prev;
            prev = cur;
            cur = forw;
            forw = forw.next;
        }
        cur.next = prev;

        root.next.next = null;
        root.next = cur;

        return cur;
    }
}