class Solution {

    public int getLength(ListNode head) {
        if (head == null)
            return 0;
        return 1 + getLength(head.next);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        int l = getLength(head);

        if (n == l) {
            return head.next;
        }

        int del = l - n;

        ListNode temp = head;
        int count = 1;

        while (count < del) {
            temp = temp.next;
            count++;
        }

        temp.next = temp.next.next;

        return head;
    }
}
