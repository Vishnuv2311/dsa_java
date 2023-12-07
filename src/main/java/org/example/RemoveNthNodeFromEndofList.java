package org.example;

public class RemoveNthNodeFromEndofList {
    public static void main(String[] args) {
        LinkedListDemo listDemo = new LinkedListDemo();
        listDemo.addLast(1);
        listDemo.addLast(2);
        listDemo.addLast(3);
        listDemo.addLast(4);
        listDemo.addLast(5);

        Node node = removeNthFromEnd(listDemo.head, 2);

        listDemo.display(node);


    }

    public static Node removeNthFromEnd(Node head, int n) {
        Node dummy = head;

        Node fast = dummy;
        Node slow = dummy;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy;
    }
}
