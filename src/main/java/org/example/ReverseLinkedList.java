package org.example;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedListDemo linkedList = new LinkedListDemo();

        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(5);


        linkedList.display();

        Node node = linkedList.reverseRecursive(linkedList.head);

        linkedList.display(node);



    }


}
