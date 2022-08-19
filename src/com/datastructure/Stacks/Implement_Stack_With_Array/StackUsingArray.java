package com.datastructure.Stacks.Implement_Stack_With_Array;

import java.util.Arrays;

public class StackUsingArray {
    private int count;
    private int[] items;


    public StackUsingArray(int capacity) {
        this.count = 0;
        this.items = new int[capacity];
    }


    public void push(int item) {
        if (count == items.length - 1) {
            throw new StackOverflowError();
        }

        items[count] = item;
        count++;
    }

    public int pop() {
        if (count == 0) throw new IllegalStateException();
        var removedItem = items[count];
        count--;
        return removedItem;
    }

    public int peek() {
        if (count == 0) throw new IllegalStateException();
        return items[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        var content = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(content);
    }

    public static void main(String[] args) {
        StackUsingArray sua = new StackUsingArray(5);
        sua.push(10);
        sua.push(20);
        sua.push(30);
        System.out.println(sua);
        sua.pop();
        System.out.println(sua);
        System.out.println(sua.peek());
        System.out.println(sua.isEmpty());

    }
}
