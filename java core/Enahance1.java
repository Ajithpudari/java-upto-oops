package com.java.practice10;

public class Enahance1 {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4,5,6,7,8,9,10};

        for (int i = 0; i < 9; i++) {
            System.out.println(a[i]);
        }
        for (int b: a) {
            System.out.println(b);
        }
    }
}