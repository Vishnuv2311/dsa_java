package org.example;

public class MergeSortedLists {
 /*
   public static ListNode mergeTwoLists(ListNode listNode1, ListNode listNode2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (listNode1 != null && listNode2 != null) {
            if (listNode1.val < listNode2.val) {
                current.next = listNode1;
                listNode1 = listNode1.next;
            } else {
                current.next = listNode2;
                listNode2 = listNode2.next;
            }
            current = current.next;
        }

        // If one of the lists is not fully processed
        if (listNode1 != null) {
            current.next = listNode1;
        } else {
            current.next = listNode2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        // Example lists
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);

        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(6);

        // Merge lists
        ListNode mergedList = mergeTwoLists(list1, list2);

        // Print the merged list
        System.out.println("Merged List:");
        System.out.println(mergedList.toString());
    }
    */
}
