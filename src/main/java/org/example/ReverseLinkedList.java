package org.example;

class ReverseLinkedList {


    public static void main(String[] args) {
        ReverseLinkedList linkedList = new ReverseLinkedList();
        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);

        System.out.println("Original linked list:");
        System.out.println(linkedList.head.toString());

        linkedList.reverse();

        System.out.println("Reversed linked list:");
        System.out.println(linkedList.head.toString());
    }

    Node head;

    public ReverseLinkedList() {
        this.head = null;
    }

    // Method to insert a new node at the end of the linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next; // Save the next node
            current.next = prev; // Reverse the link
            prev = current;      // Move prev to the current node
            current = next;      // Move current to the next node
        }

        head = prev; // Update the head of the linked list
    }

}


