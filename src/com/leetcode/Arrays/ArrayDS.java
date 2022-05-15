package com.leetcode.Arrays;

public class ArrayDS {

    private int[] items;
    private int count;

    public ArrayDS(int length) {
        items = new int[length];
    }


    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public void insert(int item) {

        //if the array is full, resize it.
        if (items.length == count) {
            //create a new array(twice the size)
            int[] newItems = new int[count * 2];
            //copy all the exists items into new array.
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            //set "items" to this new array.
            items = newItems;

        }
        items[count] = item;
        count++;
    }

    public void removeAt(int index) {
        //validate the index.
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }
        //shift the items to the left to fill the hole.
        //Eg.[10,20,30,40] index:1, we need to shift index 2,3 to the left.
        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }


    public int indexOf(int item) {
        for (int i = 0; i < count; i++) {
            if (items[i] == item) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
//        int[] myArr = new int[10];
//        myArr[0] = 10;

//        int[] myArr = {1, 2, 3, 4, 5};
//        System.out.println(myArr.length);
//        System.out.println(Arrays.toString(myArr));

        //Dynamic Array:
        ArrayDS numbers = new ArrayDS(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        numbers.insert(60);


        numbers.removeAt(2);
//        int targetIndex = numbers.indexOf(150);

        numbers.print();

//        System.out.println(targetIndex);


    }
}
