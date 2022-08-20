package com.datastructure.HashTables;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Test HashMap interface and HashMap class
        Map<Integer, String> employees = new HashMap<>();
        employees.put(1, "John");
        employees.put(2, "Mary");
        employees.put(3, "Jerry");
        employees.put(null, null); // it works.
        employees.put(4, null); // it works.
        employees.put(null, "Mia"); // it works; but it will cover the value of the first null key
        System.out.println("The Map: " + employees);

        var value = employees.get(1);
        System.out.println("The key 1 employee is : " + value);


        employees.remove(null);
        System.out.println("Map after remove key null: " + employees);

        employees.containsKey(1);//O(1)
        employees.containsValue("Mary");//O(n)
    }
}
