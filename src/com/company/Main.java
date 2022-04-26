package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(contains(12, 1, 2, 3, 4, 5,123));

    }

    static boolean contains(int a, int... varargs) {
        for (int i : varargs) {
            if (a == i) {
                return true;
            }
        }
        return false;
    }
}
