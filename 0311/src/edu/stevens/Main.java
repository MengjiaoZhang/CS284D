package edu.stevens;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        int[] ss = new int[10];
//        int i = 0;
//        System.out.println(Arrays.toString(ss));
//        System.out.println(i);
//        ss[i++] = 100;
//        ss[9] = 100;
//        System.out.println(Arrays.toString(ss));
//        System.out.println(i);

        int[] a1 = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(a1));
        int[] a2 = new int[20];
        System.out.println(Arrays.toString(a2));
//        System.arraycopy(a1, 0, a2, 0, 9);
//        System.out.println(Arrays.toString(a2));
        System.arraycopy(a1, 4, a2, 2, 3);
        System.out.println(Arrays.toString(a2));
    }
}
