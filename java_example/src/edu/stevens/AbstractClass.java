package edu.stevens;

abstract class Vehicle{
    public abstract void move();
    public void getDescription(){
        System.out.println("Vehicles are used for transportation");
    }
}

class Bicycle extends Vehicle{
    @Override
    public void move(){
        System.out.println("The bicycle pedals forward");
    }
}

class Plane extends Vehicle{
    @Override
    public void move(){
        System.out.println("The plane flys through the sky");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        Plane plane = new Plane();
        bicycle.move();
        bicycle.getDescription();
        plane.move();
        plane.getDescription();
    }
}