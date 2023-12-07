package org.example;

public class LinkedListDemo {

     Node head;
    private Node tail;
    private int size;

    LinkedListDemo() {
        head = tail = null;
        size = 0;
    }

    public void addFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;

        if (size == 0) {
            tail = node;
        }

        size++;
    }

    public void addLast(int data) {
        Node node = new Node(data);

        if (size == 0) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }

        size++;
    }

    public void addAt(int data, int position) throws Exception {
        if (position < 0 || position > size) {
            throw new Exception("Position out of bound");
        }
        if (position == 0) {
            addFirst(data);
        } else if (position == size) {
            addLast(data);
        } else {
            Node temp = head;
            for (int i = 0; i <= position; i++) {
                temp = temp.next;
            }
            Node n = new Node(data);
            n.next = temp.next;
            temp.next = n;

            size++;
        }
    }

    public int getSize() {
        return size;
    }

    public void display() {
        Node n = head;
        while (n != null) {
            System.out.print("->" + n.data);
            n = n.next;
        }
    }

    public void display(Node head) {
        Node n = head;
        while (n != null) {
            System.out.print("->" + n.data);
            n = n.next;
        }
    }

    public void reverseLinkedList() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currnetNode = head.next;

        while (currnetNode != null) {
            Node nextNode = currnetNode.next;
            currnetNode.next = prevNode;

            prevNode = currnetNode;
            currnetNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newNode = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newNode;
    }

}
