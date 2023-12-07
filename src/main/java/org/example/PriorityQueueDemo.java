package org.example;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>((a, b) -> a - b);
        priorityQueue.offer(64);
        priorityQueue.offer(342);
        priorityQueue.offer(2);
        priorityQueue.offer(32);
        priorityQueue.offer(43);

        while (!priorityQueue.isEmpty()) {
            int number = priorityQueue.poll();
            System.out.print(number+"->");
        }
    }
}
