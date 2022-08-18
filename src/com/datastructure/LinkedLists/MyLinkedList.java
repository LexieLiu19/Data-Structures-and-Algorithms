package com.datastructure.LinkedLists;

import java.util.NoSuchElementException;

public class MyLinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int item) {
            this.value = item;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }


    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public int indexOf(int item) {
        int index = 0;

        var current = first;
        while (current != null) {
            if (current.value == item) {
                return index;
            } else {
                current = current.next;
                index++;
            }
        }
        return -1;
    }

    public boolean contains(int targetItem) {
        return indexOf(targetItem) != -1;
    }


    public void removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (first == last) {
            first = last = null;
            size = 0;
            return;
        }
        var second = first.next;
        first.next = null;
        first = second;
        size--;
    }

    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (first == last) {
            first = last = null;
            size = 0;
            return;
        }

        last = getPrevious(last);
        last.next = null;
        size--;

    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        var cur = first;
        int index = 0;
        while (cur != null) {
            array[index] = cur.value;
            index++;
            cur = cur.next;
        }
        return array;
    }


    public void reverse() {
        if (first == null || last == null) return;


        var prev = first;
        var cur = first.next;
        while (cur != null) {
            var next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }


        last = first;
        last.next = null;
        first = prev;
    }

    public int getKthFromTheEnd(int k) {
        if (first == null || k > size) {
            throw new IllegalArgumentException();
        }
        ;
        var fast = first;
        var slow = first;
        for (int i = 0; i < k - 1; i++) {
            fast = fast.next;
        }
        while (fast != last) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow.value;

    }

    private Node getPrevious(Node node) {
        var current = first;

        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    private boolean isEmpty() {
        return first == null;
    }


}
