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
                var top = stack.pop();
                if (!isMatched(top, ch)) return false;
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

    private boolean isMatched(char left, char right) {
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}
