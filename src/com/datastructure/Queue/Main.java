package com.datastructure.Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Queue is an interface which can not be instantiated
        //ArrayDeque is the implement class.
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue:");
        System.out.println(queue);

        var front = queue.remove();
        System.out.println("Queue after remove()");
        System.out.println(queue);

        reverse(queue);
        System.out.println("Reversed queue: ");
        System.out.println(queue);
    }

    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
}
