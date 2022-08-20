package com.datastructure.Queue.Priority_Queues;

import java.util.Arrays;


// todo: remove() & print methods need to be improve;
public class MyPriorityQueue {

    private int[] items;
    private int count;

    public MyPriorityQueue(int capacity) {
        items = new int[capacity];
    }


    private void resize() {
        int length = items.length;
        int[] newItems = new int[length * 2];
        for (int i = 0; i < length; i++) {
            newItems[i] = items[i];
        }
        items = newItems;

    }

    private boolean isFull() {
        return count == items.length;
    }

    private int shiftItemsToInsert(int item) {
        int i;
        for (i = count - 1; i >= 0; i--) {
            if (items[i] > item) {
                items[i + 1] = items[i];
            } else {
                break;
            }
        }
        return (i + 1);
    }


    public void add(int item) {
        if (isFull()) {
            resize();
        }
        int index = shiftItemsToInsert(item);

        items[index] = item;
        count++;
    }


    public int remove() {
        if (isEmpty()) throw new IllegalStateException();
        count--;
        return items[count];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }

    public static void main(String[] args) {
        MyPriorityQueue mpq = new MyPriorityQueue(5);
        mpq.add(10);
        mpq.add(30);
        mpq.add(15);
        mpq.add(50);
        mpq.add(40);
        mpq.add(40);
        System.out.println(mpq);
        System.out.println("Remove first Item: " + mpq.remove());
        System.out.println(mpq);

    }
}
