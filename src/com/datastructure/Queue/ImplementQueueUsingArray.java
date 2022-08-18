package com.datastructure.Queue;

import java.util.Arrays;

public class ImplementQueueUsingArray {

    private int[] items;
    private int front;
    private int rear;
    private int count;


    public ImplementQueueUsingArray(int capacity) {
        this.items = new int[capacity];
    }

    public void enqueue(int num) {
        if (count == items.length) {
            throw new IllegalStateException();
        }
        items[rear] = num;
        rear++;
        count++;
    }

    public int dequeue() {
        count--;
        var item = items[front];
        items[front] = 0;
        front++;
        return item;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }

    public static void main(String[] args) {
        ImplementQueueUsingArray queue = new ImplementQueueUsingArray(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue);


        var item = queue.dequeue();
        System.out.println(item);
        System.out.println(queue);
    }
}
