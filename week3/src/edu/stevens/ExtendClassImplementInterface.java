package edu.stevens;

abstract class OneAbstract {
    static int a;
    double b;
    public void display() {
        System.out.println("This is a method of abstract class");
    }

    abstract void showAbstract();
}

interface One {
//    static int c;
    static double i = 3.0;
    final String m = "Interface";
    void show1();
}

interface Two {
    void show2();
}

public class ExtendClassImplementInterface extends OneAbstract implements One, Two{

    public void showAbstract() {
        System.out.println("The implementation of the Abstract method");
    }

    public void show1() {
        System.out.println("The implementation of the method in interface One");
    }

    public void show2() {
        System.out.println("The implementation of the method in interface Two");
    }

    public static void main(String[] args) {
        ExtendClassImplementInterface obj = new ExtendClassImplementInterface();
        obj.showAbstract();
        obj.show1();
        obj.show2();
    }
}

