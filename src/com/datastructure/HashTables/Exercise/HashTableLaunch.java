package com.datastructure.HashTables.Exercise;

/* Exercise 1: Find the first non-repeat character in a string.
 * Eg. "a green apple" - g
 */

import java.util.HashMap;
import java.util.Map;

public class HashTableLaunch {

    public char findFirstNonRepeat(String str) {
        Map<Character, Integer> letters = new HashMap<>();

        var chars = str.toCharArray();

        for (var ch : chars) {
//            if (letters.containsKey(ch)) {
//                var count = letters.get(ch);
//                letters.put(ch, count + 1);
//            } else {
//                letters.put(ch, 1);
//            }

            //use Ternary conditional  Operator：
            var count = letters.containsKey(ch) ? letters.get(ch) : 0;
            letters.put(ch, count + 1);

        }
        for (var ch : chars) {
            if (letters.get(ch) == 1) return ch;
        }


        return Character.MIN_VALUE; //if failed, return a null-like character.

    }

    public static void main(String[] args) {
        String myStr = "a green apple";
        HashTableLaunch hst = new HashTableLaunch();
        var res = hst.findFirstNonRepeat(myStr);
        System.out.println(res);
    }
}

