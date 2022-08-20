package com.datastructure.Queue.Priority_Queues;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(2);
        pq.add(9);
        pq.add(6);

        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }
    }
}
