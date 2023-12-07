package org.example;

public class LinkedListCycle {
    public static void main(String[] args) {
        LinkedListDemo listDemo = new LinkedListDemo();

        listDemo.addLast(3);
        listDemo.addLast(2);
        listDemo.addLast(0);
        listDemo.addLast(-4);


        boolean cycle = hasCycle(listDemo.head);

        System.out.println("Cycle --> --> --> " + cycle);

    }

    static boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false;
        }
        Node slow = head;
        Node fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
