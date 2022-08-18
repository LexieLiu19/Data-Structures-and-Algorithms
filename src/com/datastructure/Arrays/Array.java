package com.datastructure.Arrays;

public class Array<T> {
    private int[] array;
    private int size;

    public Array(int length) {
        array = new int[length];
        size = 0;
    }

    private int[] resize() {
        int[] newArray = new int[size * 2];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public void insert(int item) {

        array[size] = item;
        size++;
    }

    public int removeAt(int index) {
        //validate the index
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException();

        }


        int removedItem = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;
        return removedItem;
    }


    public int remove() {
        array[size - 1] = 0;
        size--;
        return array[size];
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }


    public int indexOf(int num) {
        for (int i = 0; i < size; i++) {
            if (array[i] == num) {
                return i;
            }
        }
        return -1;
    }

}
