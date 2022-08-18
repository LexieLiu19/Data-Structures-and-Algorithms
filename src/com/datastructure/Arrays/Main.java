package com.datastructure.Arrays;

public class Main {

    //O(1) runtime:1(constant time.):
    public void log(int[] numbers) {
        System.out.println(numbers[0]);
    }

    //O(n) Runtime: n; Linear

    public void log2(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    //O(2n)=O(n) Runtime: 2n; Linear
    public void log3(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    //O(n*n) Runtime: n*n; Quadratic runtime
    public void log4(int[] numbers) {
        for (int first : numbers) { //O(n)
            for (int second : numbers) {//O(n)
                System.out.println(first + "; " + second);
            }
        }
    }

    //log(n)
    public int log5(int target, int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == numbers[mid]) {
                System.out.println(mid);
                return mid;
            } else if (target > numbers[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    //O(2^n) exponential runtime
    public void log6(int[] numbers) {
    }

    public static void main(String[] args) {
        Main m = new Main();
        int[] myArr = {12, 3, 4, 5, 6, 9};
        m.log5(19, myArr);
    }
}
