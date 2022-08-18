package com.datastructure.Stacks;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {
    private final List<Character> leftBrackets = Arrays.asList('(', '<', '[', '{');
    private final List<Character> rightBrackets = Arrays.asList(')', '>', ']', '}');

    public Boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (isLeftBrackets(ch)) stack.push(ch);
            if (isRightBrackets(ch)) {
                if (stack.empty()) return false;
                stack.pop();
            }
        }

        return stack.empty();
    }

    private boolean isLeftBrackets(char ch) {
        return leftBrackets.contains(ch);
    }

    private boolean isRightBrackets(char ch) {
        return rightBrackets.contains(ch);
    }

}
