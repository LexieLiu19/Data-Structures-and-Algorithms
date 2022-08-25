package com.datastructure.Tree;

public class Main {
    public static void main(String[] args) {
        Tree t = new Tree();
        t.insert(8);
        t.insert(32);
        t.insert(10);
        t.insert(2);
        t.insert(12);
        System.out.println(t.find(100));
        System.out.println(t.find(10));

        t.traversalPreOrder();
        t.traversalPostOrder();

    }

}
