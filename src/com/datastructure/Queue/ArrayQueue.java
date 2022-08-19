package com.datastructure.Queue;

import java.util.Arrays;

public class ArrayQueue {

    private int[] items;
    private int front; //reference to the first element of the array
    private int rear; //reference to the last element of the array
    private int count;


    public ArrayQueue(int capacity) {
        this.items = new int[capacity];
    }

    public void enqueue(int num) {
        if (count == items.length) {
            throw new IllegalStateException();
        }
        items[rear] = num;
        rear = (rear + 1) % items.length;
        count++;
    }

    public int dequeue() {
        count--;
        var item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        return item;
    }

    public int peek() {
        if (count == 0) throw new IllegalStateException();
        return items[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Print queue:");
        System.out.println(queue);


        var item = queue.dequeue();
        System.out.println("Item dequeued");
        System.out.println(item);

        System.out.println("Queue after dequeue operation:");
        System.out.println(queue);


        queue.enqueue(40);
        queue.enqueue(50);

        queue.enqueue(60);

        System.out.println("Circular Array:");
        System.out.println(queue);


        System.out.println("Is empty?");
        System.out.println(queue.isEmpty());

        System.out.println("Print first item: " + queue.peek());
    }
}
