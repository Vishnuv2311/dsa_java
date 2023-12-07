package org.example;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        ListNode head = this;
        while (head != null) {
            result.append(head.val + "->");
            head = head.next;
        }
        return result.toString();
    }
}
