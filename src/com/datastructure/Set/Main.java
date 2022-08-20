package com.datastructure.Set;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        int[] numbers = {1, 2, 3, 3, 2, 2, 1, 12, 12, 11, 9};
        for (var num : numbers) {
            s.add(num);
        }

        System.out.println(s);
    }
}
