package org.example;

import java.util.PriorityQueue;

public class MergeKSortedLists {
   /* public ListNode mergeKLists(ListNode[] lists) {
        FileWriter fileWriter = new FileWriter("MergeKSortedLists");
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Add the heads of all lists to the min heap
        fileWriter.writeToFile("Add the heads of all lists to the min heap");
        for (ListNode list : lists) {
            if (list != null) {
                minHeap.offer(list);
                fileWriter.writeToFile(list.toString());
            }
        }

        fileWriter.writeToFile("minHeap");

        fileWriter.writeToFile(minHeap.toString());

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Process the min heap until it's empty
        while (!minHeap.isEmpty()) {
            // Pick the smallest node from the min heap
            fileWriter.writeToFile("\n\n");
            fileWriter.writeToFile("Pick the smallest node from the min heap");
            ListNode smallest = minHeap.poll();
            fileWriter.writeToFile(smallest.toString());

            // Move the current pointer to the smallest node
            fileWriter.writeToFile("\n\n");
            fileWriter.writeToFile("Move the current pointer to the smallest node");
            current.next = smallest;
            fileWriter.writeToFile("current.next " + current.next);
            current = current.next;
            fileWriter.writeToFile("current " + current);
            fileWriter.writeToFile("dummy result " + dummy);

            // Move the smallest node's pointer to the next node in its list
            if (smallest.next != null) {
                fileWriter.writeToFile("\n\n");
                fileWriter.writeToFile("Move the smallest node's pointer to the next node in its list");
                minHeap.offer(smallest.next);
                fileWriter.writeToFile(minHeap.toString());
            }
        }
        fileWriter.writeToFile("result " + dummy.next);
        return dummy.next;
    }

    // Helper method to print a linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example usage:
        ListNode[] lists = new ListNode[3];
        lists[0] = new ListNode(1);
        lists[0].next = new ListNode(4);
        lists[0].next.next = new ListNode(5);

        lists[1] = new ListNode(1);
        lists[1].next = new ListNode(3);
        lists[1].next.next = new ListNode(4);

        lists[2] = new ListNode(2);
        lists[2].next = new ListNode(6);

        MergeKSortedLists merger = new MergeKSortedLists();
        ListNode result = merger.mergeKLists(lists);

        System.out.println("Merged List:");
        printList(result);
    }*/
}
