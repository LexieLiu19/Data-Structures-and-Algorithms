package com.datastructure.Stacks;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        System.out.println(s);

        var top = s.peek();
        System.out.println(top);

        var removed = s.pop();
        System.out.println(removed);


        //test reverse function
        String str = "Hello World";
        var reversedStr = StringReverser.reverse(str);
        System.out.println(reversedStr);


        //test Expression isBalanced function:

        Expression exp = new Expression();
        String myExpStr = "(1+1)]*2";
        var result = exp.isBalanced(myExpStr);
        System.out.println(result);

    }
}
