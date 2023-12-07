package org.example;

public class ReorderList {
    public static void main(String[] args) {
        LinkedListDemo list = new LinkedListDemo();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        Node l1 = list.head;
        Node slowNode = list.head;
        Node fastNode = list.head;
        Node middleNode = null;

        while (fastNode != null && fastNode.next != null) {
            middleNode = slowNode;
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }

        middleNode.next = null;


        Node l2 = reverseLinkedList(slowNode);

        mergeNode(l1, l2);

        list.display(l1);


    }

    static Node reverseLinkedList(Node node) {
        Node preNode = null;
        Node currentNode = node;
        while (currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = preNode;

            preNode = currentNode;
            currentNode = nextNode;
        }
        return preNode;
    }

    static void mergeNode(Node list1, Node list2) {
        while (list2 != null) {
            Node next1 = list1.next;
            Node next2 = list2.next;

            list1.next = list1;
            list2.next = next1;

            list1 = next1;
            list2 = next2;
        }
    }


}
