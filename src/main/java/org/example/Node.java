package org.example;

public class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder data = new StringBuilder();
        Node current = this;
        while (current != null) {
            data.append(current.data).append("->");
            current = current.next;
        }
        return data.toString();
    }
}
