package edu.stevens;

public class AnotherClass extends AClass {
    public AnotherClass() {
        System.out.println("AnotherClass Constructor"); //constructor
    }

//    public boolean readFile(String s) {
//        return (s == ""); //method 3
//    }

    public boolean setValue(double i) {
//        System.out.println("AnotherClass"); // method 4
        return (i < 0);
    }

    public static void main(String[] args) {
        AnotherClass obj = new AnotherClass();
        System.out.println(obj.setValue(-3));
        System.out.println(obj.setValue(3.0));
    }
}