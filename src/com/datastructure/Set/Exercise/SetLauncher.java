package com.datastructure.Set.Exercise;

import java.util.HashSet;
import java.util.Set;

public class SetLauncher {

    public char findFirstRepeat(String str) {
        Set<Character> charSet = new HashSet<>();
        for (var ch : str.toCharArray()) {
            if (ch != ' ') {
                if (charSet.contains(ch)) return ch;
                charSet.add(ch);
            }
        }
  
        return Character.MIN_VALUE;

    }

    public static void main(String[] args) {
        String str = "a green apple";
        SetLauncher sl = new SetLauncher();
        System.out.println(sl.findFirstRepeat(str));
    }
}
