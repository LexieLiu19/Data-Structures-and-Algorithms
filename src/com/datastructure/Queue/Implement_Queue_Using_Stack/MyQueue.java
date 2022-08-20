package com.datastructure.Queue.Implement_Queue_Using_Stack;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    //O(1)
    public void enqueue(int item) {
        s1.push(item);
    }

    //O(n)
    public int dequeue() {
        if (isEmpty()) throw new IllegalStateException();
        moveFromS1toS2();

        return s2.pop();
    }

    private void moveFromS1toS2() {
        if (s2.empty()) {
            while (!s1.empty()) {
                var item = s1.pop();
                s2.push(item);
            }
        }
    }

    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    public int peek() {
        moveFromS1toS2();
        if (s2.isEmpty()) throw new IllegalStateException();
        return s2.peek();
    }

    public static void main(String[] args) {
        MyQueue mq = new MyQueue();
        mq.enqueue(10);
        mq.enqueue(20);
        mq.enqueue(30);
        System.out.println(mq.dequeue());
        System.out.println(mq.dequeue());

        System.out.println("Is the queue empty?");
        System.out.println(mq.isEmpty());

        System.out.println("Peek:" + mq.peek());
    }
}
