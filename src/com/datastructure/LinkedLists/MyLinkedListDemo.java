package com.datastructure.LinkedLists;

public class MyLinkedListDemo {
    public static void main(String[] args) {
        MyLinkedList mll = new MyLinkedList();
        mll.addFirst(1);
        mll.addFirst(2);
//        mll.addFirst(3);
//        int size = mll.size();
//        System.out.println(size);
        mll.reverse();
        var myArr = mll.toArray();
        for (int num : myArr) {
            System.out.println(num);
        }
        System.out.println(mll.getKthFromTheEnd(1));
    }
}
