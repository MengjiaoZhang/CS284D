package edu.stevens;

interface Animal{
    public void speak();
}

class Cat implements Animal{
    @Override
    public void speak(){
        System.out.println("Meow Meow");
    }
}

class Dog implements Animal{
    @Override
    public void speak(){
        System.out.println("Woof Woof");
    }
}

public class Interface {
    public static void main(String[] args) {
        Animal [] animals = {
                new Dog(),
                new Cat()
        };
        for(Animal animal : animals){
            animal.speak();
        }
    }
}


