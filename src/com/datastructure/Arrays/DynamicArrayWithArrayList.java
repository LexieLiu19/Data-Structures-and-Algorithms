package com.datastructure.Arrays;

import java.util.ArrayList;

public class DynamicArrayWithArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(4);
        list.add(6);

        System.out.println(list); //[1,4]

        list.remove(1);
        System.out.println(list);


        list.indexOf(1);
        list.lastIndexOf(1);

        list.toArray();// convert the ArrayList to normal array


    }
}
