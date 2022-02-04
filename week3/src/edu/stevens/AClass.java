package edu.stevens;

public class AClass {
    public AClass() {
        System.out.println("AClass Constructor"); // constructor
    }

    public boolean readFile(String s) {
        return (s != "");   // method 1
    }

    public boolean setValue(int i) {
        System.out.println("AClass");
        return (i < 0);   // method 2
    }
}

