package com.datastructure.Stacks;

import java.util.Stack;

public class StringReverser {
    public static String reverse(String input) {

        if (input == null) {
            throw new IllegalArgumentException();
        }

        Stack<Character> stack = new Stack<>();
        StringBuilder reversedStr = new StringBuilder();
        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());
        }
        return reversedStr.toString();
    }
}
