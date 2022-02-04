package edu.stevens;

abstract class TestAbstract {
    public void display() {
        System.out.println("This is a method of abstract class");
    }

    abstract void display2();
}
public class AbstractClassExample extends TestAbstract{
    public static void main(String args[]) {
        AbstractClassExample e = new AbstractClassExample();
        e.display();
        e.display2();
    }

    void display2() {
        System.out.println("This is the implementation of the abstract method in an abstract class");
//        System.out.println("lllll");
    }


}