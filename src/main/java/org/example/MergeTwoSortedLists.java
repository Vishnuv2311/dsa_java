package org.example;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        LinkedListDemo list1 = new LinkedListDemo();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(4);

        LinkedListDemo list2 = new LinkedListDemo();
        list2.addLast(1);
        list2.addLast(3);
        list2.addLast(4);

        Node node1 = list1.head;
        Node node2 = list2.head;

        LinkedListDemo resultList = new LinkedListDemo();

        while (node1 != null || node2 != null) {
            if (node1 == null) {
                resultList.addLast(node2.data);
                node2 = node2.next;
            } else if (node2 == null) {
                resultList.addLast(node1.data);
                node1 = node1.next;
            } else {
                int val1 = node1.data;
                int val2 = node2.data;

                if (val1 < val2) {
                    resultList.addLast(val1);
                    node1 = node1.next;
                } else {
                    resultList.addLast(val2);
                    node2 = node2.next;
                }
            }
        }

        resultList.display();
    }
}

/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }

class Solution {
 *  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
 *      ListNode node1 = list1;
 *      ListNode node2 = list2;

 *      ListNode dummyNode = new ListNode();
 *      ListNode resultNode = dummyNode;

 *      while(node1!=null||node2!=null){
 *          if(node1==null){
 *              ListNode newNode = new ListNode(node2.val);
 *              resultNode.next = newNode;
 *              node2 =node2.next;
 *          } else if(node2==null){
 *              ListNode newNode = new ListNode(node1.val);
 *              resultNode.next = newNode;
 *              node1 =node1.next;
 *           }else{
 *              int val1 = node1.val;
 *              int val2 = node2.val;

 *              if(val1<val2){
 *                  ListNode newNode = new ListNode(val1);
 *                  resultNode.next = newNode;
 *                  node1 = node1.next;
 *              }else{
 *                  ListNode newNode = new ListNode(val2);
 *                  resultNode.next = newNode;
 *                  node2 = node2.next;
 *              }
 *          }
 *          resultNode = resultNode.next;
 *      }
 *      return dummyNode.next;
 *    }
}
 */