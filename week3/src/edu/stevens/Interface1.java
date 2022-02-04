package edu.stevens;

interface M {
    public static final int d1 = 10;
    public static final String s1 = "interface";

    void method1();
}

public class Interface1 implements M {
//    int d1 = 20;
    public void method1() {
        System.out.println(s1);
        System.out.println(d1);
    }

    public static void main(String[] args) {
        Interface1 i1 = new Interface1();
        i1.method1();
    }
}
